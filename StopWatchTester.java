public class StopWatchTester
{
   public static void main(String [] args)
   {
         System.out.println(StopWatch.getNumObjects());
 StopWatch sw1 = new StopWatch();
 System.out.println(StopWatch.getNumObjects());
 StopWatch sw2 = new StopWatch();
 System.out.println(StopWatch.getNumObjects());
 // you can also access through an object
 System.out.println(sw1.getNumObjects());

   }
}