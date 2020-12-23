public class DrinkDriver
{
   public static void main(String[]args)
   {
      Drink d1 = new Drink("Water",0,0);
      
      Coffee c1 = new Coffee("Black",0,15,0,false);
      
      Drink d2 = new Coffee("Iced Decaf",4, 10,5, true);
      
      System.out.print(Drink.instances);
      System.out.print(Coffee.instances());
      
      d2.setMilk(5);
      
      
      
      
   }
}
      
      