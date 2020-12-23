import java.util.Random;

public class LoadedDice extends Random
{
   public int nextInt(int n)
   {
      int roll = 0;
      Random random = new Random();
      int isHigh = random.nextInt(2);
      if (isHigh == 1)
      {
         roll = n-1;
      }
      else if (isHigh == 0)
      {
         int randLowSide = random.nextInt(n-2);
         roll = randLowSide;
      }
      return roll;
    }
         
}
    