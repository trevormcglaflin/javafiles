public class CircleTester
{
   public static void main(String [] args)
   {
      Circle c1 = new Circle(3,3,4);
      Circle c2 = new Circle(3,3,4);
      
      if (c1 == c2)
      {
         System.out.print("true");
      }
      
                 

             
   
   
   }
   public static void displayCircle(Circle c)
   {
      System.out.printf("x : %d, y : %d, radius : %d\n", 
                        c.getX(), c.getY(), c.getRadius());
      System.out.print(c);
   }

}