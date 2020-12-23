public class Area
{
   /*
      getArea method 1 is deisgned to find
      the area of a circle given a radius 
      value.
      @ param double radius
      @ return double area of circle
   */
   public double getArea(double r)
   {
      double area = Math.PI * Math.pow(r,2.0);
      return area;
   }
   
   /* 
      getArea method 2 is designed to find the area
      of a rectangle given 2 integer values representing
      length and width.
      @ param int width
      @ param int length
      @ return double area of circle
   */
   public double getArea(int w, int l)
   {
      double area = l * w;
      return area;
   }
   
   /*
      getArea method 3 is designed to find the area
      of a cylinder given the radius and height.
      @ param double base
      @ param double height
      @ return double area of cylinder
   */
   public double getArea(double r, double h)
   {
      double area = (Math.PI * Math.pow(r,2.0)) * h;
      return area;
   }
}
   