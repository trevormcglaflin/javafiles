import java.util.Scanner;
public class MethodTesting
{
   
   public static void main(String [] args)
   {
      int quarters = getQuarters();
      int dollars = quartersToDollars(quarters);
      System.out.printf("%d quarters is equal to $%.2f.\n",quarters,dollars);
   }
   
   /**
      method get quarters will ask user to input
      number of quarters and will return that number
      @ return The number of quarters entered
   */
   public static int getQuarters()
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number of quarters: ");
      int q;
      q = input.nextInt();
      return q;
   }
   
   /**
      method will take number of quarters and will return
      the number of dollars as a double
      @ return The number of dollars
   */
   public static double quartersToDollars(int quarters)
   {
      double d = quarters/4.0;
      return d;
   }
   
   
}
  
      