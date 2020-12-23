import java.util.Date;

public class SalariedEmployee extends Employee
{
   private double salary;
   
   public SalariedEmployee(String firstName, String lastName, Date theDate, double theSalary)
   {
      super(firstName, lastName, theDate);
      salary = theSalary;
   }
   
   public double getSalary()
   {
      return salary;
   }
   
   
   public String toString()
   {
      String s = super.toString() + "\nSalary: " + salary + "\n";
      return s;
   }
   
   public boolean equals(Object other)
   {
      SalariedEmployee eOther = (SalariedEmployee)other;
      
      return super.equals(eOther) &&
             this.salary == eOther.salary;
    }
}    
    
   
   