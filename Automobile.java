// Trevor McGlaflin
// April 6, 2020
// CS 110
// Assignment 9: Automobile class

/**
   Automobile class extends the Vehicle class and
   provides additional fields and methods specifically
   for automobiles
*/
public class Automobile extends Vehicle
{
   // declare instance variables
   private int numPassengers;
   private boolean isSUV;
   
   /**
      Constructor assigns values to all fields of the Vehicle
      field and additional automobile fields.
      @param Person the person who owns the vehicle
      @param String the make of the vehicle
      @param String the model of the vehicle
      @param int year the year the vehicle was made
      @param int the number of miles the vehicle has on it
      @param int the number of passengers in the automobile
      @param boolean is the automobile a SUV
   */
   public Automobile(Person owner, String make, String model, int year, int mileage, int numPassengers, boolean isSUV)
   {
      super(owner,make,model,year,mileage);
      this.numPassengers = numPassengers;
      this.isSUV = isSUV;
   }
   
   /**
      getNumPassengers
      @return the number of passengers in the automobile
   */
   public int getNumPassengers()
   {
      return numPassengers;
   }
   
   /**
      getIsSUV
      @return is the automobile a SUV
   */
   public boolean getIsSUV()
   {
      return isSUV;
   }
   
   /**
      setNumPassengers
      @param numPassengers the number of passengers in the automobile
   */
   public void setNumPassengers(int numPassengers)
   {
      this.numPassengers = numPassengers;
   }
   
   /**
      setIsSUV
      @param isSUV is the automobile an SUV
   */
   public void setIsSUV(boolean isSUV)
   {
      this.isSUV = isSUV;
   }
   
   /**
      toString
      @return a string represesentation of an automobile
   */
   public String toString()
   {
      String s;
      if (isSUV == true)
         s = super.toString() + " " + numPassengers + " passengers SUV";
      else
         s = super.toString() + " " + numPassengers + " passengers";
      return s;
   }
   
   /**
      equals 
      @param Object a different automobile
      @return are the two automobiles the same
   */
   public boolean equals(Object other)
   {
      Automobile aOther = (Automobile)other;
      return super.equals(other) &&
             this.numPassengers == aOther.numPassengers &&
             this.isSUV == aOther.isSUV;
   }
}
      
   
   
   
   