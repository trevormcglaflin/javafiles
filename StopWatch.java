import java.lang.*;

public class StopWatch
{
   // declare variables
   private double startTime;
   private double endTime;
   public static int stopWatchCount;
   
   /*
      constuctor assigns current time to start time
   */
   public StopWatch()
   {
      stopWatchCount++;
      startTime = System.currentTimeMillis();
   }
   
   /*
      start method will reassign the startTime to the
      current time when called
   */
   public void start()
   {
      startTime = System.currentTimeMillis();
   }
   
   /*
      end method will assign the endTime to the current time
   */
   public void end()
   {
      endTime = System.currentTimeMillis();
   }
   
   /*
      elapsedTime will return the time that has passed since
      the start time.
      @ return double elapsed time
   */
   public double elapsedTime()
   {
      double elapsedTime = (endTime - startTime)/1000.0;
      return elapsedTime;
   }
   
   public static int getNumObjects()
   {
      return stopWatchCount;
   }
   
   public static void setNumObjects(int s)
   {
      stopWatchCount = s;
   }
   
   
      
}  
   
   