public class ShapeDriver
{
   public static void main(String[]args)
   {
      // part 3
      Shape s = new Circle("Blue",true,8);
      Shape s2 = new Square("Green",false,10);
      
      // Question 4: you can only apply the Shape class methods in each shape
      //however, for getArea, since it is overridden, it will use the correct overridden method
      
      // Question 5: it calls the Shape's toString method
      
      // Question 6: it goes to the overridden version of those methods
      
      // Question 7: no you can't call the getRadius method because it is a Shape reference
      
      // part 11:
      if (s.isEquals(s2))
      System.out.printf("%.2f == %.2f", s.getArea(), s2.getArea());
      else if (s.isGreater(s2))
      System.out.printf("%.2f > %.2f", s.getArea(), s2.getArea());
      else if (s.isLess(s2))
      System.out.printf("%.2f < %.2f", s.getArea(), s2.getArea()); 
    }
}
   