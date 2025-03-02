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
