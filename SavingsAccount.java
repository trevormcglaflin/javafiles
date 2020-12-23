public class SavingsAccount extends BankAccount
{
   private double rate = 0.025;
   
   private int savingsNumber = 0;
   
   private String accountNumber;
   
   public SavingsAccount(String name, double amount)
   {
      super(name,amount);
      accountNumber = super.getAccountNumber() + "-" + savingsNumber;
      savingsNumber ++;
   }
   
   public SavingsAccount(SavingsAccount account, double amount)
   {
      super(account,amount);
      savingsNumber ++;
      accountNumber = super.getAccountNumber() + "-" + savingsNumber;
   }
   
   public void postInterest()
   {
      double monthlyInterest = rate/12 * super.getBalance();
      super.deposit(monthlyInterest);
   }
   
   
   public String getAccountNumber()
   {
      return accountNumber;
   }
}
       
   
   