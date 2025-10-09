public class App {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(3000);
        a1.deposit(500);
        a1.withdraw(700);

        BankAccount a2 = new BankAccount(a1.getBalance());

        System.out.println("Account 1 balance: " + a1.getBalance());
        System.out.println("Account 2 balance: " + a2.getBalance());
    }
}
