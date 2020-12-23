public abstract class Ship
{
   // instance fields
   private String name;
   private int year;
   
   
   public Ship(String name, int year)
   {
      this.name = name;
      this.year = year;
   }
   
   
   public String getName()
   {
      return name;
   }
   
   public int getYear()
   {
      return year;
   }
   
   public void setName(String name)
   {
      this.name = name;
   }
   
   public void setYear(int year)
   {
      this.year = year;
   }
   
   public String toString()
   {
      String s = name + ", " +  year;
      return s;
   }
   
}
      
   
      