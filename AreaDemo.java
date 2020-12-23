public class AreaDemo
{
   public static void main(String [] args)
   {
      Area a = new Area();
      
      double aOfCircle = a.getArea(20.0);
      double aOfRectangle = a.getArea(20,10);
      double aOfCylinder = a.getArea(10.0,15.0);
      
      System.out.printf("The area of a circle with radius 20.0 is equal to %.2f\n",aOfCircle);
      System.out.printf("The area of a rectangle with length 10 and width 20 is equal to %.2f\n",aOfRectangle);
      System.out.printf("The area of a cylinder with radius 10.0 and height 15.0 is equal to %.2f\n",aOfCylinder);
    }
}
                         
      
      
      