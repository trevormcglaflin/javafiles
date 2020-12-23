public class Drink
{
   private String name;
   private int sugar;
   private int carbs;
   public static int instances;
   
   public Drink(String name, int sugar, int carbs)
   {
      this.sugar = sugar;
      this.carbs = carbs;
      this.name = name;
      instances ++;
   }
   
   public int getSugar()
   {
      return sugar;
   }
   
   public int getCarbs()
   {
      return carbs;
   }
   
   public String getName()
   {
      return name;
   }
   
   public void setSugar(int sugar)
   {
      this.sugar = sugar;
   }
   
   public void setCarbs(int carbs)
   {
      this.carbs = carbs;
   }
   
   public void setName(String name)
   {
      this.name = name;
   }
   
   public String toString()
   {
      String s = name + " Sugar: " + sugar +  " grams Carbs: " + carbs + " grams\n";
      return s;
   }
}