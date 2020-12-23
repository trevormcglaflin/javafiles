import java.util.Date;

public class HourlyEmployee extends Employee
{
   private double wageRate;
   private int hours;
   
   public HourlyEmployee(String firstName, String lastName, Date theDate, double theWageRate, int theHours)
   {
      super(firstName, lastName, theDate);
      wageRate = theWageRate;
      hours = theHours;
   }
   
   public double getWageRate()
   {
      return wageRate;
   }
   
   public int getHours()
   {
      return hours;
   }
   
   public void setWageRate(double theWageRate)
   {
      wageRate = theWageRate;
   }
   
   public void setHours(int theHours)
   {
      hours = theHours;
   }
   
   // toString
   @Override
   public String toString()
   {
      String s = super.toString() + "\nWage Rate: $" + wageRate + " per hour. Hours worked: " + hours + "\n";
      return s;
   }
   
   // equals method
   @Override
   public boolean equals(Object other)
   {
      HourlyEmployee eOther = (HourlyEmployee)other;
      
      return super.equals(eOther) &&
             this.wageRate == eOther.wageRate &&
             this.hours == eOther.hours;
    }
      
   
}
   