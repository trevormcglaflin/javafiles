public class Circle extends Shape
{
   // instance variables
   private double radius;
   
   
   public Circle(String color, boolean filled, double radius)
   {
      super(color,filled);
      this.radius = radius;
   }
   
   public double getRadius()
   {
      return radius;
   }
   
   public void setRadius(double radius)
   {
      this.radius = radius;
   }
   
   public void draw()
   {
      System.out.println("drawing a Circle");
   }
   
   public double getArea()
   {
      return Math.PI * Math.pow(radius,2);
   }
   
}