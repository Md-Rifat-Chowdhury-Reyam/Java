abstract class BankAccount{
    private String AccountNumber;
    private double balance;

    public BankAccount(String AccountNumber, double balance)
    {
        this.AccountNumber = AccountNumber;
        this.balance = balance;

    }

    public String getAccountNumber()
    {return AccountNumber;}

    public double getBalance()
    {
        return balance;
    }

    protected void setBalance(double balance)
    {
        this.balance = balance;
    }
    public abstract void deposit(double amount);
    public abstract void withdraw( double amount);
}


class SavingsAccount extends BankAccount {
   
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

  
    @Override
    public void deposit(double amount) {
        
        setBalance(getBalance() + amount);
        
        System.out.println("Deposit of $" + amount + " successful. Current balance: $" + getBalance());
    }

    
    @Override
    public void withdraw(double amount) {
        
        if (getBalance() >= amount) {
           
            setBalance(getBalance() - amount);
         
            System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());
        } else {
       
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
}


class CurrentAccount extends BankAccount {
    
    
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance); 
    }

 
    @Override
    public void deposit(double amount) {
       
        setBalance(getBalance() + amount);
        
        System.out.println("Deposit of $" + amount + " successful. Current balance: $" + getBalance());
    }

    
    @Override
    public void withdraw(double amount) {
        
        if (getBalance() >= amount) {
           
            setBalance(getBalance() - amount);
          
            System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());
        } else {
           
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
}
 

public class Main {
    
    public static void main(String[] args) {
       
        SavingsAccount s = new SavingsAccount("2221", 200);
        s.deposit(100);
        s.withdraw(50);
        s.withdraw(300);

        CurrentAccount c = new CurrentAccount("2222", 500);
        c.deposit(200); 
        c.withdraw(100);
        c.withdraw(700);
    }
}