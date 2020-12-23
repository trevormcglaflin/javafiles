// Trevor McGlaflin
// January 23, 2019
// CS 110
// Subraction Tutor

// import necessary classes
import java.util.Scanner;
import java.util.Random;

// define SubtractionTutor class 
public class SubtractionTutor
{
   // define main method
   public static void main(String[] args)
   {
      // welcome student and explain how tutor works
      System.out.println("Welcome to the Subtraction Tutor");
      System.out.println("You will supply a low value and a high value, defining the range ");
      System.out.println("of values to be included in your quiz. You will get 5 problems.");
      System.out.println("The values must be positive and no larger than 9999");
      
      // create Scanner object to read input
      Scanner input = new Scanner(System.in);
      
      // prompt user for low and high values and store in variables
      // use do-while loops to ensure values are between 1-9999
      int low, high;
      do
      {
      System.out.print("Low Value: ");
      low = input.nextInt();
      }
      while (low<=0||low>9999);
      do
      {
      System.out.print("High Value: ");
      high = input.nextInt();
      }
      while (high<=0||high>9999);
      System.out.print("\n\n");
      
      // declare and initialize variable that will record number of correct answers
      int answersCorrect = 0;
      
      // create for loop that will ask 5 different subtraction questions
      for (int count=0;count<5;count++)
      {
      
         // generate two random numbers in given range
         Random randomNumbers = new Random();
         int num1, num2;
         num1 = randomNumbers.nextInt(high-low)+low;
         num2 = randomNumbers.nextInt(high-low+1)+low;
         
         // ask question and record if answer is correct
         int answer;
         if (num1>=num2)
            {
               System.out.printf("  %d\n",num1);
               System.out.printf("- %d\n",num2);
               System.out.println("----");
               System.out.print("Answer? ");
               answer = input.nextInt();
               if (answer==num1-num2)
               {
                  System.out.println("Correct!\n\n");
                  answersCorrect += 1;
               }
               else
               {
                  int correctAnswer = num1-num2;
                  System.out.printf("Incorrect! The answer is %d\n\n",correctAnswer);
               }
            }
            else if (num2>num1)
            {
               System.out.printf("  %d\n",num2);
               System.out.printf("- %d\n",num1);
               System.out.println("----");
               System.out.print("Answer? ");
               answer = input.nextInt();
               if (answer==num2-num1)
               {
                  System.out.println("Correct!\n\n");
                  answersCorrect += 1;
               }
               else
               {
                  int correctAnswer = num2-num1;
                  System.out.printf("Incorrect! The answer is %d\n\n",correctAnswer);
               }
            }
           
          } 
          // display results of quiz based on number of correct answers
          System.out.println("The quiz is over.");
          if (answersCorrect==5)
            System.out.println("Excellent! You got all 5 questions correct.");
             
          else if (answersCorrect>2&&answersCorrect<5)
            System.out.println("You got over half correct, practice makes perfect!");
          
          else
            System.out.println("You got less than half correct, you need to spend more time practicing.");
      
    }
}
      