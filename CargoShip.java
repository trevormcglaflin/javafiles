public class CargoShip extends Ship
{
   private int capacity;
   
   public CargoShip(String name, int year, int capacity)
   {
      super(name,year);
      this.capacity = capacity;
   }
   
   public int getCapacity()
   {
      return capacity;
   }
   
   public void setCapacity(int capacity)
   {
      this.capacity = capacity;
   }
   
   public String toString()
   {
      String s = "Name: " + super.getName() + ", Capacity: " + capacity;
      return s;
   }
}
   
      