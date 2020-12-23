public class Square extends Shape
{
   private double side;
   
   public Square(String color, boolean filled, double side)
   {
      super(color,filled);
      this.side = side;
      
   }
   
   public double getSide()
   {
      return side;
   }
   
   public void setSide(double side)
   {
      this.side = side;
   }
   
   public void draw()
   {
      System.out.println("drawing a Square");
   }
   
   public double getArea()
   {
      return Math.pow(side,2);
   }
   
   
   
}