import java.util.Scanner;
public class Average
{
   // declare instance variables
   private int[] data;
   private double mean;
   
   public Average()
   {
      data = new int[5];
   }
   
   public void getUserData()
   {
      Scanner keyboard = new Scanner(System.in);
      
      for (int count = 0; count < 5; count ++)
      {
         System.out.printf("Enter score number %d:",count+1);
         data[count] = keyboard.nextInt();
      }
      
   }
   
   public void calculateMean()
   {
      int total = 0;
      
      for (int score: data)
      {
         total += score;
      }
      
      mean = (double)total/data.length;
   }
   
   
   public String toString()
   {
      String s = "Scores\n-----\n";
      
      for (int score: data)
      {
         s += score;
         s += "\n";
      }
      
      s += "\nMean Score\n----------\n" + mean;
      
      return s;
   }
      
      
      
      
    
}
      
         
   