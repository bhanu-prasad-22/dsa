class BankAccount
{
    int accNo;
    String holderName;
    double balance;

    BankAccount(int accNo,String holderName,double balance)
    {
        this.accNo=accNo;
        this.holderName=holderName;
        this.balance=balance;
    }
    void deposit(double amount)
    {
        balance+=amount;
        System.out.println("Amount depositted:"+amount);
    }
    void withdraw(double amount)
    {
        if(balance<amount)
        {
            System.out.println("insuffcient funds "+balance);
        }
        else
        {
            balance-=amount;
            System.out.println(amount+" amount withdrawn");
        }
    }
    void displayBalance()
    {
        System.out.println(balance);
    }
}
class SavingsAccount extends BankAccount
{
    double intrestrate;
    SavingsAccount(int accNo,String holderName,double balance,double intrestrate)
    {
        super(accNo,holderName,balance);
        this.intrestrate=intrestrate;
    }
   void applyIntrest() {
    double interest = balance * intrestrate / 100;
    balance += interest;
    System.out.println("Interest applied: " + interest);
    System.out.println("New balance: " + balance);
}
}
class Main
{
    public static void main(String[] args)
    {
        SavingsAccount acc=new SavingsAccount(123,"chintu",1000000,10);
        acc.applyIntrest();
        acc.deposit(1000);
        acc.withdraw(1000);
        acc.displayBalance();
    }
}