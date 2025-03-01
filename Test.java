abstract class BankAccount{
   public String accountNumber;
   public double balance;
   

   public BankAccount( String accountNumber,double balance)
   {
      this.accountNumber = accountNumber;
      this.balance = balance;

   }

   public String getAccountNumber()
   {
      return accountNumber;
   }

   public double getBalance()
   {
      return balance;
   }

   protected void setBalance(double balance)
   {
      this.balance = balance;
   }

   public abstract void deposit(double amount);
   public abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount{
   public SavingsAccount(String accountNumber, double balance)
   {
      super(accountNumber,balance);
   }

   @Override
   public void deposit(double amount)
   {
     setBalance(getBalance()+amount);
   }

   @Override
   public void withdraw(double amount)

      {if(getBalance()>= amount)
      {
         setBalance(getBalance()- amount);

      }
      else{
         System.out.println("Insufficient balance");
      }
   
   }
}

public class Test{
   public static void main(String[] args) {
      BankAccount b = new SavingsAccount("123456", 1000);
      b.deposit(500);   

      System.out.println("Account Number: "+b.getAccountNumber());
      System.out.println("Balance: "+b.getBalance()); 
   }
}