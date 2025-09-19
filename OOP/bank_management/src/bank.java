public class bank
{
public String account_holder_name;
private double balance;
private int account_id;

bank(String n, double b, int ac)
{
    account_holder_name=n;
    balance=b;
    account_id=ac;

}
public double get_balance()
{
    return balance;
}
private void change_balance(double amount , int type)
{
    if(type==0)
    {
        balance=balance+amount;
    }
    else
    {
        balance=balance-amount;
    }

}
public void deposit(double amount)
{
   change_balance(amount, 0);
}

public void withdraw(double amount)
{
    change_balance(amount, 1);
}


}