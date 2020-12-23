public class PowerSavings extends CheckingAccount
{
   public final double PENALTY = 0.025;
   
   private double rate = 0.05;
   
   private int monthsToMaturity;
   
   private int elapsedMonths;
   
   public PowerSavings(String name, double amount, int monthsToMaturity)
   {
      super(name,amount);
      this.monthsToMaturity = monthsToMaturity;
      elapsedMonths = 0;
   }
   
   public void addAMonth()
   {
      double interestAmount = (rate/12) * super.getBalance();
      super.setBalance(super.getBalance() + interestAmount);
      elapsedMonths ++;
   }
   
   public int getMonthsToMaturity()
   {
      return monthsToMaturity;
   }
   
   public int getElapsedMonths()
   {
      return elapsedMonths;
   }
   
   public void setMonthsToMaturity(int monthsToMaturity)
   {
      this.monthsToMaturity = monthsToMaturity;
   }
   
   public void setElapsedMonths(int elapsedMonths)
   {
      this.elapsedMonths = elapsedMonths;
   }
   
   public boolean withdraw(double amount)
   {
       boolean completed = true;
       if (amount < super.getBalance())
       {
         if(elapsedMonths >= monthsToMaturity)
         {
            super.setBalance(super.getBalance()-amount);
         }
         else
         {
            super.setBalance(super.getBalance()-(amount*(1+PENALTY)));
         }
       }
       else
       {
         completed = false;
       }
       return completed;
    }
    
    public String toString()
    {
      String s = String.format("%s, #%s, $%.2f: %d months elapsed : %d months to maturity", super.getOwner(), super.getAccountNumber(), super.getBalance(), elapsedMonths, monthsToMaturity);
      return s;
    }
}
   