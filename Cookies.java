/*
This program will find amount of ingredients needed
for any given number of cookies inputed
*/

// import Scanner
import java.util.Scanner;

// define class
public class Cookies
{
   // define main method
   public static void main(String[] args)
   {
      // declare cookie variable as int
      int cookies;
      
      // create Scanner object called input
      Scanner input = new Scanner(System.in);
      
      // recieve and store input
      System.out.print("Enter the number of cookies: ");
      cookies = input.nextInt();
      
      // declare ingredient variables as floats
      double sugar, butter, flour;
      
      // calculate ingredient quantities and store in respective variable
      sugar = cookies * (1.5/48);
      butter = cookies * (1.0/48);
      flour = cookies * (2.75/48);
      
      // display results
      System.out.printf("To make %d cookies, you will need: \n",cookies);
      System.out.printf("%.1f cups of sugar\n",sugar);
      System.out.printf("%.1f cups of butter\n",butter);
      System.out.printf("%.1f cups of flour\n",flour);
      
      
    }
}
      
      