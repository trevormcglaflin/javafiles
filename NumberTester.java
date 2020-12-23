// Trevor McGlaflin
// January 29, 2019
// CS 110
// NumberTester Assignment

// import Scanner and io
import java.util.Scanner;
import java.io.*;

// name class NumberTester
public class NumberTester
{
   public static void main(String [] args) throws IOException
   {
      // open file and make Scanner object that can read it
      File file = new File("numbers.txt");
      Scanner inputFile = new Scanner(file);
      
      // create header of table
      System.out.println("\t\t Repeat");
      System.out.println("Number Digits   Even  Prime");
      
      // declare necessary variables
      int n;
      boolean repeatDigits, even, prime;
      
      
      
      // create while loop that will display a + or - depending
      // on whether or not there are repeat digits, n is a prime number
      // or if it is even, for each number in numbers.txt
      while (inputFile.hasNext() == true)
      {
         n = inputFile.nextInt();
         System.out.printf("%4d",n);
         
         repeatDigits = isRepeatDigits(n);
         if (repeatDigits == true)
            System.out.print("\t   +");
         else 
            System.out.print("\t   -");
    
         even = isEven(n);
         if (even == true)
            System.out.print("\t\t  +");
         else
            System.out.print("\t\t  -");
         
         prime = isPrime(n);
         if (prime == true)
            System.out.print("\t\t+\n");
         else 
            System.out.print("\t\t-\n");
         
        
      }
   }
   
   /**
      This method takes an integer and determines
      if there are any two consecutive digits in it
      @ param int n The integer from numbers.txt
      @ return boolean tOrF Stores boolean value 
      depending on if there are consecutive digits
   */
   public static boolean isRepeatDigits(int n)
   {
      // declare digit variables that will store individual digits
      int digit1 = 0;
      int digit2 = 0;
      int digit3 = 0;
      
      
      // create series of if statements to pick out
      // individual digits using the modulus operator
      if (n/100 > 0)
      {
         digit1 = n/100;
         n = n%100;
      }
      if (n/10 > 0)
      {
         digit2 = n/10;
         digit3 = n%10;
      }
      else 
         digit3 = n;
      
      
      
      // create if statements that will return true
      // or false depending on if there are repeat digits
      if (digit1 == 0 && digit2 == 0)
         return false;
      else if (digit1 == 0)
      {
         if (digit2 == digit3)
            return true;
         else
            return false;
      }
      else
      {
         if (digit1 == digit2 || digit2 == digit3)
            return true;
         else
            return false;
      }
   }
   
   /**
      This method will test to see if an integer is even.
      If it is even, the funtion will return true. If not,
      it will return false.
      @ param int n The given integer from numbers.txt
      @ return boolean True if number is even
   */
   public static boolean isEven(int n)
   {
      if (n%2 == 0)
         return true;
      else
         return false;
   }
   
   /**
      This method will test to see if an integer is a prime
      number. If it is then it will return true . If not,
      it will return false.
      @ param int n The given integer from numbers.txt
      @ return boolean True if number is prime
   */
   public static boolean isPrime(int n)
   {
      // declare divisible which will count up if
      // a number is found that divides into the given
      // integer
      int divisible = 0;
      for(int count = 2; count < n; count++)
      {
         if (n%count == 0)
            divisible ++;
      }
      
      // return true if no numbers divided into the integer
      if (divisible > 0)
         return false;
      else
         return true;
    }
      
 }     
            
      
      
      
      
      
      
      
