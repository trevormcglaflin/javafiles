public abstract class Shape implements Relatable
{
   // instance variables
   private String color;
   private boolean filled;
   
   private final String DEF_COLOR = "blue";
   private final boolean DEF_FILLED = false;
   
   
   public Shape()
   {
      color = DEF_COLOR;
      filled = DEF_FILLED;
   }
   
   public Shape(String color, boolean filled)
   {
      this.color = color;
      this.filled = filled;
   }
   
   public String getColor()
   {
      return color;
   }
   
   public boolean getFilled()
   {
      return filled;
   }
   
   public void setColor(String color)
   {
      this.color = color;
   }
   
   public void setFilled(boolean filled)
   {
      this.filled = filled;
   }
   
   public void draw()
   {
      System.out.println("drawing a Shape");
   }
   
   public String toString()
   {
      String s = "Color: " + color + "Filled: " + filled + "\n";
      return s;
   }
   
   public abstract double getArea();
   
   public boolean isEquals(Shape s)
   {
      return this.getArea() == s.getArea();
   }
   
   public boolean isGreater(Shape s)
   {
      return this.getArea() > s.getArea();
   }
   
   public boolean isLess(Shape s)
   {
      return this.getArea() < s.getArea();
   }
}