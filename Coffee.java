public class Coffee extends Drink
{
   private int milk;
   private boolean iced;
   private static int instances;
   
   public Coffee(String name, int sugar, int carbs, int milk, boolean iced)
   {
      super(name,sugar,carbs);
      this.milk = milk;
      this.iced = iced;
      instances ++;
   }
   
   public Coffee(String name, int sugar, int carbs, int milk)
   {
      this(name, sugar,carbs, milk,false);
      
      
   }
   
   public int getMilk()
   {
      return milk;
   }
   
   public boolean getIced()
   {
      return iced;
   }
   
   public void setMilk(int milk)
   {
      this.milk = milk;
   }
   
   public void setIced(boolean iced)
   {
      this.iced = iced;
   }
   
   public static int instances()
   {
      return instances;
   }
   
   public double carbsPerOunce(double o)
   {
      double cpo = super.getCarbs() / o;
      return cpo;
   }
   
   public String toString()
   {
      String s = super.toString() + " Milk: " + milk;
      if (iced = true)
         s = s + "ICED";
      else
         s = s + "HOT";
      return s;
   }
}