// Trevor McGlaflin
// March 26, 2020
// CS 110
// Assignment 8: Truck Class

/**
      Truck class is a subclass of Vehicle class and contains
      addittional fields and methods specific for trucks.
*/
public class Truck extends Vehicle
{
      // declare instance fields and constants
      private int capacity;
      private int numAxles;
      private final int DEF_CAPACITY = 1;
      private final int DEF_AXLES = 2;
      
      /**
            constructor 1 assigns values to all vehicle fields, 
            capacity, and numAxles.
            @param Person the person who owns the vehicle
            @param String the make of the vehicle
            @param String the model of the vehicle
            @param int year the year the vehicle was made
            @param int the number of miles the vehicle has on it
            @param int the capacity of the truck in tons
            @param int the number of axles on the truck
      */
      public Truck(Person owner, String make, String model, int year, int mileage, 
                   int capacity, int numAxles)
      {
            super(owner, make, model, year, mileage);
            this.capacity = capacity;
            this.numAxles = numAxles;
      }
      
      /**
            constructor 2 assigns values to all vehicle fields 
            and default values to subclass truck fields. Rather
            than taking a person it takes the seperate name, address
            and phone of the person who owns the truck.
            @param String the name of person who owns vehicle
            @param String the address of person who owns vehicle
            @param String the phone number of person who owns vehicle
            @param String the make of the vehicle
            @param String the model of the vehicle
            @param int year the year the vehicle was made
            @param int the number of miles the vehicle has on it
      */
      public Truck(String name, String address, String phone, String make, 
                   String model, int year, int mileage)
      {
            super(new Person(name,address,phone), make, model, year, mileage);
            capacity = DEF_CAPACITY;
            numAxles = DEF_AXLES;
      }
      
      /**
            getCapacity
            @return the capacity in tons of the truck
      */
      public int getCapacity()
      {
            return capacity;
      }
      
      /**
            getNumAxles
            @return the number of axles on truck
      */
      public int getNumAxles()
      {
            return numAxles;
      }
      
      /**
            setCapacity
            @param int the capacity in tons of the truck
      */
      public void setCapacity(int capacity)
      {
            this.capacity = capacity;
      }
      
      /**
            setNumAxles
            @param int the number of axles on truck
      */
      public void setNumAxles(int numAxles)
      {
            this.numAxles = numAxles;
      }
      
      /**
            toString mehtod returns a string representation
            of a truck. 
            @return a string representation of a truck
      */
      public String toString()
      {
            return super.toString() + " " + capacity + " ton " + numAxles + " axles";
      }
      
      /**
            equals method compares two truck objects and if all
            vehicle fields, capacity and numAxles are equal. 
            @param Object a seperate Truck object
            @return true or false
       */
       public boolean equals(Object other)
       {
            Truck tOther = (Truck)other;
            return super.equals(tOther) &&
                   this.capacity == tOther.capacity &&
                   this.numAxles == tOther.numAxles;
       }
}
            
      
      
      
      
      
     