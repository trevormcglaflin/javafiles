import java.util.Scanner;
// TASK #3 Add the file I/O import statement here
import java.io.*;
/**
 This class reads numbers from a file, calculates the
 mean and standard deviation, and writes the results
 to a file.
*/
public class StatsDemo
{
 // TASK #3 Add the throws clause
 public static void main(String[] args) throws IOException
 {
 
 double sum = 0; // The sum of the numbers
 int count = 0; // The number of numbers added
 double mean = 0; // The average of the numbers
 double stdDev = 0; // The standard deviation
 double line; // To hold a line from the file
 double difference; // The value and mean difference
 // Create an object of type Scanner
 Scanner keyboard = new Scanner (System.in);
 String filename; // The user input file name
 // Prompt the user and read in the file name
 System.out.println("This program calculates " +
 "statistics on a file " +
"containing a series of numbers");
 System.out.print("Enter the file name: ");
 filename = keyboard.nextLine();
// ADD LINES FOR TASK #4 HERE
File file = new File(filename); // Create a File object passing it the filename
Scanner numbers = new Scanner(file); // Create a Scanner object passing File object
while (numbers.hasNext() == true) // Loop until you are at the end of the file
   {
      line = numbers.nextDouble(); // Read a double value add the
      sum += line; // Add the value to sum
      count ++; // Increment the counter
   }
   
numbers.close(); // Close the input file
mean = sum/count; // Store the calculated mean
 // ADD LINES FOR TASK #5 HERE
File file1 = new File(filename); // Reconnect File object passing it the filename
Scanner nums = new Scanner(file1); // Reconnect Scanner object passing File object
sum = 0; // Reinitialize the sum of the numbers
count = 0; // Reinitialize the number of numbers added

while (nums.hasNext() == true)// Loop until you are at the end of the file
{
   line = nums.nextDouble(); // Read a double value
   difference = line-mean; // Subtract the mean
   sum += Math.pow(difference,2.0);// Add the square of the difference to the sum
   count++; // Increment the counter
}
nums.close(); // Close the input file
stdDev = Math.sqrt(sum/(double)count);// Store the calculated standard deviation
 // ADD LINES FOR TASK #3 HERE
PrintWriter pw = new PrintWriter("Results.txt"); // Create a PrintWriter object using "Results.txt"
pw.printf("The mean is %.3f.\n",mean);
pw.printf("The standard deviation is %.3f.\n",stdDev); // Print the results to the output file
pw.close();// Close the output file
 }
}
