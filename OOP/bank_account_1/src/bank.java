public class bank {

    private String Account_holder_name;
    private double balance;
    private int account_id;
    bank(String n,double b, int id)
    {
        Account_holder_name=n;
        balance=b;
        account_id=id;
    }
    public double get_balance()
    {
        return balance;
    }
    public void deposit(double amount)
    {
       
        balance=balance+amount;
        System.out.println("amount added successfully"+balance);
    }
    public void withdraw(double amount)
    {
       if(amount<balance)
       {
        balance=balance-amount;
        System.out.println("amount added successfully"+balance);
        }
        System.out.println("insufficient balance"+balance);
    }
    public void set_name(String name)
    {
        Account_holder_name=name;
    }

    public String getname()
    {
        return Account_holder_name;
    }
    
}
