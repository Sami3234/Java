public class App {
    public static void main(String[] args) throws Exception {
        Bank bank = new Bank();
        bank.setaccountHolder("Sami");
        bank.setbalance(1000);

        System.out.println("Bank accout name is "+bank.getaccountHolder());
        System.out.println("Bank accout balance is "+bank.getbalance());
    }
}
