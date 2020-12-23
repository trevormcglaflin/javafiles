// Trevor McGlaflin
// March 26, 2020
// CS 110
// Assignment 8: Person class

/**
   Person class provides methods for storing and returning
   a person object's name, address and phone number. It also
   overrides toString and equals methods.
*/

public class Person
{
     // declare instance variables
     private String name;
     private String address;
     private String phone;
      
      
     /**
         constructor takes 3 string parameters and assigns them
         to name, address, and phone.
         @ param String the person's name
         @ param String the person's address
         @param String the person's phone number
     */
     public Person(String name, String address,String phone)
     {
         this.name = name;
         this.address = address;
         this.phone = phone;
     }
     
     /**
         getName
         @ return the person's name
     */
     public String getName()
     {
         return name;
     }
     
     /**
         getAddress
         @ return the person's address
     */
     public String getAddress()
     {
         return address;
     }
     
     /**
         getPhone
         @return the person's phone number
     */
     public String getPhone()
     {
         return phone;
     }
     
     /**
         setName
         @param String the person's name
     */
     public void setName(String name)
     {
         this.name = name;
     }
     
     /**
         setAddress
         @param String the person's address
     */
     public void setAdrress(String address)
     {
         this.address = address;
     }
     
     /**
         setPhone
         @param String the person's phone number
     */
     public void setPhone(String phone)
     {
         this.phone = phone;
     }
     
     /**
         toString method creates and returns person's 
         name and info seperated by comma's.
         @return string form of person's name and info
     */
     public String toString()
     {
         String s = name + ", " + address + ", " + phone;
         return s;
     }
     
     /*
         equals method tests if two Person objects
         have the same 3 instance fields. 
         @param Object a seperate Person object
         @return true or false
     */
     public boolean equals(Object other)
     {
         Person pOther = (Person)other;
         
         return this.name.equals(pOther.name) &&
                this.address.equals(pOther.address) &&
                this.phone.equals(pOther.phone);
      }
}
      
   
   
   