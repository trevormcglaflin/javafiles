// Trevor McGlaflin
// April 6, 2020
// CS 110
// Assignment 9: Taxi class

/**
   Taxi class extends automobile class which extends
   vehicle class. It contains two extra fields which
   are driver and ID and methods to get and set those fields
*/
public class Taxi extends Automobile
{
   // declare instance variables
   private String ID;
   private Person driver;
   
   /**
      constructor assigns all automobile and vehicle
      fields, and new taxi fields.
      @param Person the person who owns the vehicle
      @param String the make of the vehicle
      @param String the model of the vehicle
      @param int year the year the vehicle was made
      @param int the number of miles the vehicle has on it
      @param int the number of passengers in the automobile
      @param boolean is the automobile a SUV
      @param String ID of the taxi
      @param Person driver of the taxi
   */
   public Taxi(Person owner, String make, String model, int year, int mileage, 
               int numPassengers, boolean isSUV, String ID, Person driver)
   {
      super(owner,make,model,year,mileage,numPassengers,isSUV);
      this.ID = ID;
      this.driver = driver;
   }
   
   /**
      getID
      @return the ID of the taxi
   */
   public String getID()
   {
      return ID;
   }
   
   /**
      getDriver
      @return the driver of the taxi
   */
   public Person getDriver()
   {
      return driver;
   }
   
   /**
      setID
      @param String the ID of the taxi
   */
   public void setID(String ID)
   {
      this.ID = ID;
   }
   
   /**
      setDriver
      @param Person the driver of the taxi
   */
   public void setDriver(Person driver)
   {
      this.driver = driver;
   }
   
   /**
      toString 
      @return a string representation of a taxi
   */
   public String toString()
   {
      String s = super.toString() + ",\nDriver: " + driver.toString() + " ID#" + ID;
      return s;
   }
   
   /**
      equals
      @param Object a different taxi
      @return are the two taxis the same
   */
   public boolean equals(Object other)
   {
      Taxi tOther = (Taxi)other;
      return super.equals(tOther) &&
             this.ID.equals(tOther.ID) &&
             this.driver.equals(tOther.driver);
             
    }
             
   
}
               
               
                  
   
