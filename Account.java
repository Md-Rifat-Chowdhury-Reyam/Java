package Interface;

public interface Account {

    public void deposit(double amount);
    public void withdraw(double amount);

    public double getBalance();


    
}

class SavingsAccount implements Account{

    double balance;
    double interestRate;

    public SavingsAccount(double balance, double interestRate)
    {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount)
    {
        balance = balance + amount; //balance += amount;
    }

    @Override
    public void withdraw(double amount)
    {
        if(balance>= amount)
        {
            balance = balance -amount;

        }
        else{System.out.println("Insuficiant Balance you have");}
    }

   
    @Override
    public double getBalance() {
        return balance;
       
    }

    public double getInterest()
    {
        return (balance += balance*interestRate/100);
    }

}

class CurrentAccount implements Account{
    double balance;
    double creditLimit;

    public CurrentAccount (double balance, double creditLimit)
    {
        this.balance = balance;
        this.creditLimit = creditLimit;
    }

    @Override
    public void deposit(double amount)
    {
        balance = balance +amount;
        
    }

    @Override
    public void withdraw(double amount)
    {
        if(balance+ creditLimit >= amount)
        {
            balance = balance - amount;
        }
    }

    @Override
    public double getBalance()
    {
        return balance;
    }

    public void OverCreditLimit(double creditLimit)
    {
        this.creditLimit = creditLimit;
    }


}


