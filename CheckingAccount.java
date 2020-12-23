public class CheckingAccount extends BankAccount
{
   private static final double FEE = 0.15;
   
   public CheckingAccount(String name, double amount)
   {
      super(name,amount);
      
      String checkingAccountNumber = getAccountNumber() + "-10";
      
      setAccountNumber(checkingAccountNumber);
      
    }
    
    public boolean withdraw(double amount)
    {
      double amountPlusFee = amount + FEE;
      
      return super.withdraw(amountPlusFee);
    }
}