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


class SavingsAccount extends BankAccount{

  public SavingsAccount(String AccountNumber, double balance)
  {
    super(AccountNumber, balance);
  }

  @Override
  public void deposit(double amount)
  { System.out.println("Your Current Balance is  "+getBalance());
    setBalance(getBalance()+amount);
    
    System.out.println(amount+" BDT Deposit successfull"+ " Now your Balance is "+getBalance());
  }


  @Override 
  public void withdraw(double amount)
  {
    if(getBalance()>=amount){
        setBalance(getBalance()-amount);
        System.out.println("Withdrawal successfull  "+amount+"  your balance is "+getBalance());
    }
    else{
        System.out.println("Your want withdraw "+ amount+" Sorry, your balance is "+getBalance());
        System.out.println("Insufficient balance");
    }
  }
}


class CurrentAccount  extends BankAccount

{
    public CurrentAccount(String AccountNumber, double balance)
    {
        super(AccountNumber,balance);
    }

    @Override
    public void  deposit(double amount){
        setBalance(getBalance()+amount);
        System.out.println(amount+"Deposit successful"+ "your Balance is"+getBalance());

    }

    @Override
    public void withdraw(double amount)
    {if(getBalance()>=amount)
    
    {
        setBalance(getBalance()-amount);
        System.out.println("Withdrawal successful"+amount+"`your balance is"+getBalance());
    }
    else{
        System.out.println("Insufficient balance"+getBalance());
    }}

}
 

public class BankAcc{
    public static void main(String[] args) {
        BankAccount sa = new SavingsAccount("1234", 1000);
        sa.deposit(500);
        sa.withdraw(200);
        sa.withdraw(2000);
       


    }
}