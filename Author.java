// Trevor McGlaflin
// February 13, 2020
// CS 110
// Author class

/*
  Author class provides various methods for storing, altering 
  and displaying information about an Author.
*/
public class Author
{
      
      // declare instance variables
      private String firstName;
      private String lastName;
      private String email;
      
      
     /*
         Author constructor takes three string references
         and assigns them to firstName, lastName, and email.
         @ param String First name
         @ param String Last name
         @ param String Email
     */
      public Author(String f, String l, String e)
      {
         firstName = f;
         lastName = l;
         email = e;
      }
      
      
      
      
      
      // the following 3 methods are accessors which
      // return the current value of each instance
      // variable. 
      
      
      
      /*
         getFirstName returns first name of author.
         @ return String First name
      */
      public String getFirstName()
      {
         return firstName;
      }
      
      /*
         getLastName returns last name of author.
         @ return String Last name
      */
      public String getLastName()
      {
         return lastName;
      }
      
      
      /*
         getEmail returns email of author.
         @ return String FEmail
      */
      public String getEmail()
      {
         return email;
      }
      
      
      
      
      
      
      // the next 3 methods are mutator methods which mutate
      // the values stored in instance variables to the value
      // in the parameter
      
      
     /*
         setFirstName sets first name to given
         parameter.
         @ param String First name
      */
      public void setFirstName(String f)
      {
         firstName = f; 
      }
      
      
      /*
         setLasttName sets last name to given
         parameter.
         @ param String Last name
      */
      public void setLastName(String l)
      {
         lastName = l; 
      }
      
      
      /*
         setEmail sets email to given parameter.
         @ param String Email
      */
      public void setEmail(String e)
      {
         email = e; 
      }
      
      
      
      
      
      
      
      /*
         toString method displays all instance variables
         printed out.
      */
      public String toString()
      {
         String s =  firstName + " " 
                  +  lastName  + " "
                  +  "<" + email + ">";
         return s;
      }
      
      
      
      
      
      
      /*
         equals method compares the values of first name and 
         last name of 2 instances of this class. If contents
         are equal, it return true.
         @ param Object Object 2
         @ return Boolean Status
      */
      public boolean equals(Object object2)
      {
         Author author2 = (Author)object2;
         
         return this.firstName == author2.firstName &&
                this.lastName == author2.lastName &&
                this.email == author2.email;
       }
}
      
      
      
      
   
       
         
      