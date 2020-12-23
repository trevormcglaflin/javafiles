import java.util.Date;
public class EmployeeDriver
{
   public static void main(String[]args)
   {
   
      // create employee objects
      HourlyEmployee hEmployee1 = new HourlyEmployee("Trevor","McGlaflin",new Date(2020,1,22), 15.0, 40);
      HourlyEmployee hEmployee2 = new HourlyEmployee("Trevor","McGlaflin",new Date(2020,1,22), 15.0, 40);
      HourlyEmployee hEmployee3 = new HourlyEmployee("Jackie","Horton",new Date(2020,1,22), 15.0, 40);
      SalariedEmployee sEmployee1 = new SalariedEmployee("Jim","Eddy",new Date(2019,2,20),100000);
      SalariedEmployee sEmployee2 = new SalariedEmployee("Jim","Eddy",new Date(2019,2,20),100000);
      SalariedEmployee sEmployee3 = new SalariedEmployee("John","Smith", new Date(2019,2,20),90000);
      
      // demonstrate toString for an hourly employee and a salaried employee
      
      System.out.println("Hourly Employee\n" + hEmployee2.toString());
      System.out.println("Salary Employee\n" + sEmployee2.toString());
      
      // demonstrate equals method for both types of employees
      
      if (hEmployee1.equals(hEmployee2))
         System.out.println("True");
      
      else
         System.out.println("False");
         
      
      if (sEmployee2.equals(sEmployee3))
         System.out.println("True");
      else
         System.out.println("False");
         
       
     
      
      
      
     
     
     
    }
}