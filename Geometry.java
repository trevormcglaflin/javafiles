import java.util.Scanner;

/**
This program demonstrates static methods

*/

public class Geometry
{

   public static void main(String[] args)
   {
      int choice;	// The user's choice
      
      double value = 0; // The method's return value
      char letter;	// The user's Y or N decision
      double radius;	// The radius of the circle
      double length;	// The length of the rectangle
      
      double width;	// The width of the rectangle
      double height;	// The height of the triangle
      double base;	// The base of the triangle
      
      double side1;	// The first side of the triangle
      double side2;	// The second side of the triangle
      double side3;	// The third side of the triangle
   
      //	Create a scanner object to read from the keyboard 
      Scanner keyboard = new Scanner(System.in);
      
      //	The do loop allows the menu to be displayed first
      do
      {
      //	TASK #1 Call the printMenu method
      printMenu();
   
         choice = keyboard.nextInt();
   
         switch (choice)
         {
            case 1:
               System.out.print("Enter the radius of the circle: ");
               radius = keyboard.nextDouble();
   
               value = circleArea(radius);
               
   
               System.out.println("The area of the circle is " + value);
   
               break;
            case 2:
               System.out.print("Enter the length of the rectangle: ");            
               length = keyboard.nextDouble(); 
               System.out.print("Enter the width of the rectangle: "); 
               width = keyboard.nextDouble();
   
               value = rectangleArea(length,width);
   
               System.out.println("The area of the rectangle is " + value);
               
               break;
            case 3:
               System.out.print("Enter the height of the triangle: ");
               
               height = keyboard.nextDouble(); 
               System.out.print("Enter the base of the triangle: "); 
               base = keyboard.nextDouble();
               
               value = triangleArea(height,base);
               
               System.out.println("The area of the triangle is " + value);
               
               break;
            case 4:
               System.out.print("Enter the radius of the circle: ");
               
               radius = keyboard.nextDouble();
   
               value = circumference(radius);
   
               System.out.println("The circumference of the circle is " + value);
               break;
               
            case 5:
               System.out.print("Enter the length of the rectangle: ");            
               length = keyboard.nextDouble(); 
               System.out.print("Enter the width of the rectangle: "); 
               width = keyboard.nextDouble();
   
               value = rectanglePerimeter(length,width);
               
   
               System.out.println("The perimeter of the rectangle is " + value);
               break;
               
            case 6:
               System.out.print("Enter the length of side 1 of the triangle: ");
               side1 = keyboard.nextDouble();
               
               System.out.print("Enter the length of side 2 of the triangle: ");
               side2 = keyboard.nextDouble();
               
               System.out.print("Enter the length of side 3 of the triangle: ");
               
               side3 = keyboard.nextDouble();
               
               value = trianglePerimeter(side1,side2,side3);
               
               System.out.println("The perimeter of the triangle is " + value);
               break;
               
            default:
               System.out.println("You did not enter a valid choice.");
   
         }
   
         keyboard.nextLine(); // Consume the new line
         System.out.println("Do you want to exit " + "the program (Y/N)?: ");
         String answer = keyboard.nextLine(); 
         letter = answer.charAt(0);
   
      } while(letter != 'Y' && letter != 'y');
   }
   
   
   public static void printMenu()
   {
      System.out.print("This is a geometry calculator\n"
                      + "Choose what you would like to calculate\n"
                      + "1. Find the area of a circle\n"
                      + "2. Find the area of a rectangle\n"
                      + "3. Find the area of a triangle\n"
                      + "4. Find the circumference of a circle\n"
                      + "5. Find the perimeter of a rectangle\n"
                      + "6. Find the perimeter of a triangle\n"
                      + "Enter the number of your choice: ");

    } 
    
    /* 
      circleArea method will find the area of a circle
      if given the radius
      @ param double The radius
      @ return double The circle area
    
    */
     public static double circleArea(double r)
    {
      double area = (Math.PI)*(Math.pow(r,2.0));
      return area;
    }    
    
    /*
      This method will find the area of a rectangle
      if given the length and width of it
      @ param double The width
      @ param double The length
      @ return double The rectangle area
    */
     public static double rectangleArea(double l, double w)
    {
      double area = l * w;
      return area;
    }
    
    /*
      This method will find the area of a triangle
      if given the base and height of it
      @ param double The height
      @ param double The base
      @ return double The triangle area
    */
    public static double triangleArea(double h, double b)
    {
      double area = (h*b)/2;
      return area;
    }
    
    /*
      This method will find the circumference of a circle
      if given the radius
      @ param double The radius
      @ return double The circle circumference
    */
    public static double circumference(double r)
    {
      double c = 2 * Math.PI * r;
      return c;
    }
    
    /*
      This method will find the perimeter of a rectangle
      if given the length and width of it
      @ param double The width
      @ param double The length
      @ return double The rectangle perimeter
    */
    public static double rectanglePerimeter(double l,double w)
    {
      double p = 2*l + 2*w;
      return p;
    }
    
    /*
      This method will find the perimeter of a triangle
      if given the the value of each side
      @ param double Side1
      @ param double Side2
      @ param double Side3
      @ return double The triangle perimeter
    */
    public static double trianglePerimeter(double s1, double s2, double s3)
    {
      double p = s1 + s2 + s3;
      return p;
    }
}
 