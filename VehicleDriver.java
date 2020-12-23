// Trevor McGlaflin
// April 12, 2020
// CS 110
// Assignment 9: VehicleDriver class

// import necessary java packages
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

/**
   VehicleDriver class demonstrates Vehicle class
   and related subclasses by reading from a text
   file containing vehicle info, and finding the oldest
   vehicle, or vehicles. 
*/
public class VehicleDriver
{
   public static void main(String[]args) throws IOException
   {
      // open vehicles.txt file
      File file = new File("Vehicles.txt");
      
      // create scanner object
      Scanner input = new Scanner(file);
      
      // create array list object which will store vehicles
      ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
      
      // create boolean variable which will be true when a new vehicle should be made
      boolean newCar = true;
     
      // loop creating Vehicle objects from text file
      while (input.hasNext())
      {
         String vehicleType = input.nextLine();
         
         if (vehicleType.equals("Taxi"))
         {
               String name = input.nextLine();
               String address = input.nextLine();
               String phone = input.nextLine();
               String make = input.nextLine();
               String model = input.nextLine();
               String stringYear = input.nextLine();
               String stringMileage = input.nextLine();
               String stringNumPassengers = input.nextLine();
               String stringIsSUV = input.nextLine();
               String driverName = input.nextLine();
               String driverAddress = input.nextLine();
               String driverPhone = input.nextLine();
               String ID = input.nextLine();
               int year = Integer.parseInt(stringYear);
               int mileage = Integer.parseInt(stringMileage);
               int numPassengers = Integer.parseInt(stringNumPassengers);
               boolean isSUV = Boolean.parseBoolean(stringIsSUV);
               Person owner = new Person(name,address,phone);
               Person driver = new Person(driverName,driverAddress,driverPhone);
               vehicles.add(new Taxi(owner, make, model, year, mileage, numPassengers, isSUV, ID, driver));
               newCar = true;
           }
           else if (vehicleType.equals("Truck"))
           {
               String name = input.nextLine();
               String address = input.nextLine();
               String phone = input.nextLine();
               String make = input.nextLine();
               String model = input.nextLine();
               String stringYear = input.nextLine();
               String stringMileage = input.nextLine();
               String stringCapacity = input.nextLine();
               String stringNumAxles = input.nextLine();
               int year = Integer.parseInt(stringYear);
               int mileage = Integer.parseInt(stringMileage);
               int capacity = Integer.parseInt(stringCapacity);
               int numAxles = Integer.parseInt(stringNumAxles);
               Person owner = new Person(name,address,phone);
               vehicles.add(new Truck(owner, make, model, year, mileage, capacity, numAxles));
               newCar = true;
             }
             else if (vehicleType.equals("Automobile"))
             {
               String name = input.nextLine();
               String address = input.nextLine();
               String phone = input.nextLine();
               String make = input.nextLine();
               String model = input.nextLine();
               String stringYear = input.nextLine();
               String stringMileage = input.nextLine();
               String stringNumPassengers = input.nextLine();
               String stringIsSUV = input.nextLine();
               int year = Integer.parseInt(stringYear);
               int mileage = Integer.parseInt(stringMileage);
               int numPassengers = Integer.parseInt(stringNumPassengers);
               boolean isSUV = Boolean.parseBoolean(stringIsSUV);
               Person owner = new Person(name,address,phone);
               vehicles.add(new Automobile(owner, make, model, year, mileage, numPassengers, isSUV));
               newCar = true;
             }
      }
       
      // close text file
      input.close();
       
      // find two oldest cars in ArrayList of vehicles and store them in new ArrayList called oldVehicles
      ArrayList<Vehicle> oldVehicles = new ArrayList<Vehicle>();
      for (Vehicle v : vehicles)
      {
            if (oldVehicles.size() == 0)
            {
               oldVehicles.add(v);
            }
            else if (oldVehicles.size() > 0 && v.getYear() < oldVehicles.get(0).getYear())
            {
               oldVehicles.set(0,v);
            }
            else if (oldVehicles.size() > 0 && v.getYear() == oldVehicles.get(0).getYear())
            {
               oldVehicles.add(v);
            }
       }
       
       
       // display the old vehicles to be sold
       System.out.println("Vehicles to be sold: ");
       int count = 1;
       for (Vehicle v : oldVehicles)
       {
            if (v instanceof Taxi)
            {
               System.out.println("Taxi: " + count + ": " + v.toString()+ "\n");
            }
            else if (v instanceof Truck)
            {
               System.out.println("Truck: " + count + ": " + v.toString()+ "\n");
            }
            else if (v instanceof Automobile)
            {
               System.out.println("Autombobile: " + count + ": " + v.toString()+ "\n");
            }
            count ++;
       }

   }
}
      
      
                 