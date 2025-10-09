public class BankAccount {
    private double balance;

    public BankAccount() {
        balance = 0;
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println(amount + " add a new balance: " + balance);
        } else {
            System.out.println("Amount must greater than zero.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println( "withdrawn amount: "+amount);
            System.out.println("remaining amount: " + balance);
        } else {
            System.out.println("not enough balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}
