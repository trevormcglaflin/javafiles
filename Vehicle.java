// Trevor McGlaflin
// March 26, 2020
// CS 110
// Assignment 8: Vehicle Class

/**
   Vehicle Class contains fields and methods for storing,
   accessing, and manipulating information about a generic
   vehicle including owner, make, model, year and mileage.
*/
public class Vehicle
{
   // declare instance fields
   private Person owner;
   private String make;
   private String model;
   private int year;
   private int mileage;
   
   /**
      first constructor assigns the 5 given parameters to owner,
      make, model, year and mileage.
      @param Person the person who owns the vehicle
      @param String the make of the vehicle
      @param String the model of the vehicle
      @param int year the year the vehicle was made
      @param int the number of miles the vehicle has on it
   */
   public Vehicle(Person owner, String make, String model, int year, int mileage)
   {
         this.owner = owner;
         this.make = make;
         this.model = model;
         this.year = year;
         this.mileage = mileage;
    }
    
    /**
       second constructor does not include a mileage parameter
       and assigns mileage to 0.
       @param Person the person who owns the vehicle
       @param String the make of the vehicle
       @param String the model of the vehicle
       @param int year the year the vehicle was made
    */
    public Vehicle(Person owner, String make, String model, int year)
    {
         this(owner, make, model, year, 0);
    }
    
    /**
         getOwner
         @return the person who owns the vehicle
    */
    public Person getOwner()
    {
         return owner;
    }
    
    /**
         getMake
         @return the make of the vehicle
    */
    public String getMake()
    {
         return make;
    }
    
    /**
         getModel
         @return the model of the vehicle
    */
    public String getModel()
    {
         return model;
    }
    
    /**
         getYear
         @return the year of the vehicle
    */
    public int getYear()
    {
         return year;
    }
    
    /**
         getMileage
         @return the mileage of the vehicle
    */
    public int getMileage()
    {
         return mileage;
    }
    
    /**
         setOwner
         @param Person the owner of the vehicle
    */
    public void setOwner(Person owner)
    {
         this.owner = owner;
    }
    
    /**
         setMake
         @param String the make of the vehicle
    */
    public void setMake(String make)
    {
         this.make = make;
    }
    
    /**
         setModel
         @param String the model of the vehicle
    */
    public void setModel(String model)
    {
         this.model = model;
    }
    
    /**
         setYear
         @param int the year of the vehicle
    */
    public void setYear(int year)
    {
         this.year = year;
    }
    
    
    /**
         setMileage
         @param in the mileage on the vehicle
    */
    public void setMileage(int mileage)
    {
         this.mileage = mileage;
    }
    
    /**
         toString method returns a string representation
         of a vehicle object.
         @return string representation of a vehicle object
    */
    public String toString()
    {
         String s = owner.toString() + "\n" + make + " " + model + " " + year + " " + mileage + " years";
         return s;
    }
    
    /**
         equals method checks if two vehicles are equal
         and returns true or false depending on if they are
         or not.
         @param Object a seperate Vehicle object
         @return true or false
    */
    public boolean equals(Object other)
    {
         Vehicle vOther = (Vehicle)other;
         return this.owner.equals(vOther.owner) &&
                this.make.equals(vOther.make) &&
                this.model.equals(vOther.model) &&
                this.year == vOther.year &&
                this.mileage == vOther.mileage;
    }
}
       
    