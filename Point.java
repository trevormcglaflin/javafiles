public class Point
{
   public static final int  DEFAULT_COORDINATE = 25;
   private int x;
   private int y;
   
   public Point(int x, int y)
   {
      this.x = x;
      this.y = y;
   }
   
   public Point()
   {
      this(DEFAULT_COORDINATE, DEFAULT_COORDINATE);
   }
   
   public Point(Point other)
   {
      this(other.x,other.y);
   }
   
   public int getX()
   {
      return x;
   }
   
   public int getY()
   {
      return y;
   }
   
   public void setX(int x)
   {
      this.x = x;
   }
   
   public void setY(int y)
   {
      this.y = y;
   }
   
   public String toString()
   {
      String s = "(" + x + ", " + y + ")";
      return s;
   }
   
   public boolean equals(Object other)
   {
      Point pOther = (Point)other;
      return this.x == pOther.x &&
             this.y == pOther.y;
   }
   
        
}