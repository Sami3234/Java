public class App {
    public static void main(String[] args) throws Exception {
       
        bank AH1= new bank("ali",20000,0001 );
        bank AH2= new bank("xyz",10000,0002 );
        System.out.println("Current balance is::"+AH1.get_balance());
        AH1.deposit(10000);
        AH1.withdraw(5000);
        AH2.deposit(25000);
        // AH1.change_balance(10000,1);
        System.out.println("Current balance is::"+AH1.get_balance());
         System.out.println("Current balance is::"+AH2.get_balance());

    }
}
