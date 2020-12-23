// Trevor McGlaflin
// April 16, 2020
// CS 110
// Assignment 10: NameDriver class
import java.util.Scanner;
public class FileDriver
{
   public static void main(String[]args)
   {
      // create Scanner object to read keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      // prompt user for name of file and store in reference variable
      System.out.print("Enter the name of the file ");
      String filename = keyboard.nextLine();
      
      // prompt user for name that they are searching for and store in reference variable
      System.out.print("Enter name you would like to search ");
      String name = keyboard.nextLine();
      
      // get input for number of names user wants to search through
      System.out.print("How many names would you like to search through? ");
      String s = keyboard.nextLine();
      int i = 0;
      boolean correctInput = false;
      while (correctInput == false)
      {
         try
         {
            i = Integer.parseInt(s);
            while (i < 1)
            {
               System.out.println("Enter a positive integer value ");
               i = keyboard.nextInt();
            }
            correctInput = true;
         }
         catch (Exception e)
         {
            System.out.println("Enter a positive integer value ");
            s = keyboard.nextLine();
         }              
       }
       
       // create array with given length
       String[] names = new String[i];
       
       // use readFile method to load file content into names array
       int numElements = ArrayFunctions.readArray(filename, names);
       
       // sort the array of names in alphabetical order
       ArrayFunctions.selectionSort(names,numElements);
       
       // use writeArray to write sorted array data to new file
       boolean writeArray = ArrayFunctions.writeArray("sorted_"+filename,names);
       
       int location = ArrayFunctions.binarySearch(names, 0, names.length, name);
       
       System.out.print(location);
       
       
       
       
       
       
    }
}
         

         
          