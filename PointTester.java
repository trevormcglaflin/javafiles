public class PointTester
{
   public static void main(String [] args)
   {
      Point p1 = new Point();
      Point p2 = new Point(5,6);
      Point p3 = new Point(p2);
      
      
      
      p2.setX(5);
      
      if (p2.equals(p3))
         System.out.print("True");
      
      
      
   }
}
                         
      
      
      