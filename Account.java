
package Interface;

import java.util.ArrayList;
import java.util.List;

interface Account {

    public void deposit(double amount);
    public  void withdraw(double amount);
    public double getBalance();


     
}


class SavAcc implements Account{

    double balance;
    double interestRate;


    public SavAcc(double balance, double interestRate){
        this.balance = balance;
        this.interestRate = interestRate;
        System.out.println("Current balance: $"+balance);
    }

    @Override   

    public void deposit(double amount)
    {
        balance+= amount;
        System.out.println("Deposit of $"+amount+" Successfull");
    }

    @Override
    public void withdraw(double amount)
    {
        if(balance >= amount)

            {
                balance -= amount;
                System.out.println("Withdraw of  $"+amount+ " successdull"+" Current Balance: $"+balance);

            }
         else{
            System.out.println("Insufficient Balance");
         }   

        
    }

    @Override
    public double getBalance()
    {
        System.out.println("Current Balance Rifat: $"+balance);
        return balance;
    }

    public double getInterestRate()
    {  
         
        return balance = balance+ balance*interestRate/100;
        
    }

}


class CurrAcc implements Account{
    double balance;
    double creditLimit = 1000;

    public CurrAcc(double balance)
    {
        this.balance = balance;
        
        System.out.println("Current balance: $"+balance);
    }


    @Override 
    public void deposit(double amount)
    {
        balance += amount;
        System.out.println("Deposit of $"+amount+" Successfull");
    }

    @Override
    public void withdraw(double amount)
    {
        if(balance >= amount)
        {
            if(creditLimit >= amount)
            {
                
                 balance -= amount;
                 System.out.println("Withdraw of $"+amount+" Successfull"+" Current Balance: $"+balance);

            }

            
            else{
                System.out.println("Credit limit exceeded");
            }
            
            
        }

        
        else{
            System.out.println("Insufficient Balance");
        }

    }

    @Override
    public double getBalance()
    {
        System.out.println("Now your balance is $"+balance);
        return balance;
    }



}

class BankAcc{

    private List<Account> accounts;

    public BankAcc()
    {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account)
    {
        accounts.add(account);
    }
    public void removeAccount(Account account)
    {
        accounts.remove(account);
    }

    public void deposit(Account account, double amount)
    {
        account.deposit(amount);
    }

    public void  withdraw(Account account, double amount)
    {
        account.withdraw(amount);
    }

    public void printAcc( Account accopunt)
    {
        for(Account account : accounts)
        {
            System.out.println("your Balance in your account is "+account.getBalance());
        }
    }
}




class Accountt{
    public static void main(String[] args) {

       
        
        SavAcc s = new SavAcc(1000, 5);

        s.deposit(1000);
        s.getBalance();

        s.getInterestRate();
        s.getBalance();

        System.out.println("====================================");

        CurrAcc c = new CurrAcc(5000);
       c.deposit(1000);
       c.getBalance();
       c.withdraw(1000);

       System.out.println("====================================");


       BankAcc bank = new BankAcc();
       bank.addAccount(s);
       bank.printAcc(s);

       bank.addAccount(c);

       bank.printAcc(c);
       
    
    }
}

