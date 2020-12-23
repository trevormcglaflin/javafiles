import java.util.Scanner;
public class LinearProgramming
{
   public static void main(String [] args)
   {
      // create Scanner object
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter objective function coefficient for x1: ");
      int x1 = input.nextInt();
      
      System.out.print("Enter objective funtion coefficient for x2: ");
      int x2 = input.nextInt();
      
      System.out.print("Max or min(0 or 1): ");
      int goal = input.nextInt();
      
      System.out.print("How many constraints where left hand >= right hand: ");
      int leftGreater = input.nextInt();
      
      System.out.print("How many constraints where left hand <= right hand: ");
      int rightGreater = input.nextInt();
      
      int[][] constraints = new int[4][leftGreater + rightGreater];
      
      int [] constraint = new int[4];
      
      for (int i = 1; i <= leftGreater; i++)
      {
         System.out.print("Constraint " + i + ":\nx1 coefficient: ");
         int x1c = input.nextInt();
         System.out.print("x2 coefficient: ");
         int x2c = input.nextInt();
         System.out.print("Right hand side: ");
         int rh = input.nextInt();
         constraint[0] = x1c; constraint[1] = x2c; constraint[2] = rh; constraint[3] = 0;
         constraints[i-1] = constraint;
      }
      
      for (int i = leftGreater + 1; i <= leftGreater + rightGreater; i++)
      {
         System.out.print("Constraint " + i + ":\nx1 coefficient: ");
         int x1c = input.nextInt();
         System.out.print("x2 coefficient: ");
         int x2c = input.nextInt();
         System.out.print("Right hand side: ");
         int rh = input.nextInt();
         constraint[0] = x1c; constraint[1] = x2c; constraint[2] = rh; constraint[4] = 1;
         constraints[i-1] = constraint;
      }
      
      // display constraints
      System.out.println("Okay here is the layout\n");
      
      System.out.print("Objective Function: " + x1 + "x1 + " + x2 + "x2\n")
      
      if (goal = 0)
         System.out.print("Goal: Max\n");
      else
         System.out.print("Goal: Min\n");
      
      int count = 1;
      for (int[] c: constraints)
      {
         System.out.print("Constraint " + count + ": " + c[0] + "x1 + "
         

         
         
         
    }
}