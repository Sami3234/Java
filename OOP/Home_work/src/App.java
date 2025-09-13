public class App {
    public static void main(String[] args) throws Exception {
        bank ah1 = new bank("Ali", 2000, id: 001);
        System.out.println("Your balance is :" + ah.getBalance());
        ah1.deposit(5000);
        ah1.withdraw(2000);
        ah1.deposit(1000);
        System.out.println("Your balance is :" + ah1.getBalance());
    }
}
