public class CruiseShip extends Ship
{
   private int numPassengers;
   
   public CruiseShip(String name, int year, int numPassengers)
   {
      super(name,year);
      this.numPassengers = numPassengers;
   }
   
   public int getNumPassengers()
   {
      return numPassengers;
   }
   
   public void setNumPassengers(int numPassengers)
   {
      this.numPassengers = numPassengers;
   }
   
   public String toString()
   {
      String s = "Name: " + super.getName() + ", Passengers:  " + numPassengers;
      return s;
   }
}