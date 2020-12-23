// import scanner and io
import java.util.Scanner;
import java.io.*;

public class DepositsAndWithdrawals
{
   
   public static void main(String[]args) throws IOException
   {
      // use setInterestRate method to find annual interest rate
      double interestRate = setInterestRate();
      
      // set starting account balance to $500.00
      double balance = 500.00; 
      
      // create instance of SavingsAccount class and use
      // interestRate and balance as parameter variables
      SavingsAccount myAccount = new SavingsAccount(balance,interestRate);
      
      // print the starting balance
      System.out.printf("Starting balance: %.2f\n",myAccount.getBalance());
      
      // call method addDeposits that will add each deposit
      // from Deposits.txt and update/print account balance
      // after each new deposit
      addDeposits(myAccount);
      
      // call method subtractWithdrawals that will subtract
      // each withdrawal from Withdrawals.txt and update/print
      // account balance after each withdrawal
      subtractWithdrawals(myAccount);
      
      // print out the amount of interest earned this month
      System.out.printf("Interest earned: $%.2f\n",myAccount.getLastInterest());
      
      // call method displayEndBalance that will add this months
      // interest to balance and print ending balance value
      displayEndBalance(myAccount);
      
   }
   
   
   /*
      method setInterestRate will ask user to input
      a value for annual interest rate and return that
      value. 
      @ return double The interest rate
   */
   public static double setInterestRate()
   {
      // create instance of scanner class called input
      Scanner input = new Scanner(System.in);
      
      // prompt user to enter interest rate and store in variable
      System.out.print("Enter the saving account's annual interest rate: ");
      double interestRate = input.nextDouble();
      
      // return the entered interest rate as a double
      return interestRate;
    }
    
    
    /*
      method addDeposits will add the deposits listed in 
      Deposits.txt to the account balance. It will also
      print the deposit amount and the current balance
      everytime there is a new deposit. 
    */
    public static void addDeposits(SavingsAccount myAccount) throws IOException
    {
      // create File object called depositsFile that
      // stores contents of Deposits.txt
      File depositsFile = new File("Deposits.txt");
      
      // create Scanner object called scanDeposits that
      // will read from depositsFile object
      Scanner scanDeposits = new Scanner(depositsFile);
      
      // create loop that will add each line of depositsFile
      // object to account balance. Also it will display the
      // amount deposited and the current account balance.
      while (scanDeposits.hasNext() == true)
      {
         double amount = scanDeposits.nextDouble();
         myAccount.deposit(amount);
         double balance = myAccount.getBalance();
         System.out.printf("Deposit: $%.2f , balance = $%.2f\n",amount,balance);
      }
      
      // close Scanner
      scanDeposits.close();
    }
    
    /*
      method subtractWithdrawals will subtract the withdrawals listed in 
      Withdrawals.txt from the account balance. It will also
      print the withdrawal amount and the current balance
      everytime there is a new withdrawal. 
      @ param SavingsAccount The instance of SavingsAccount that stores my account
   */
    public static void subtractWithdrawals(SavingsAccount myAccount) throws IOException
       {
         // create File object called withdrawalsFile that
         // stores contents of Deposits.txt
         File withdrawalsFile = new File("Withdrawals.txt");
         
         // create Scanner object called scanWithdrawals that
         // will read from withdrawalsFile object
         Scanner scanWithdrawals = new Scanner(withdrawalsFile);
         
         // create loop that will subtract each line of withdrawlsFile
         // object from account balance. Also it will display the
         // amount withdrawn and the current account balance.
         while (scanWithdrawals.hasNext() == true)
         {
            double amount = scanWithdrawals.nextDouble();
            myAccount.withdraw(amount);
            double balance = myAccount.getBalance();
            System.out.printf("Withdrawal: $%.2f, balance = $%.2f\n",amount,balance);
         }
         
         // close Scanner
         scanWithdrawals.close();
       }
       
       /*
         method displayEndBalance will calculate end balance by adding
         this months interest. Then it will print it out.
         @ param SavingsAccount My account
       */
       public static void displayEndBalance(SavingsAccount myAccount)
       {
         double endBalance = myAccount.getBalance() + myAccount.getLastInterest();
         System.out.printf("Ending balance: $%.2f\n",endBalance);
       }
}
      
   
      