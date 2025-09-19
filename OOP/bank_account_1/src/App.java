
public class App {
    public static void main(String[] args) throws Exception {
        // bank ah1= new bank("ali",0, 001);
        // System.out.println("your balance is::"+ah1.get_balance());
        // ah1.deposit(5000);
        // ah1.withdraw(20000);
        // ah1.deposit(1000);
        // ah1.set_name("ali ahmad");
       
        // System.out.println("Account holder name::"+ah1.getname());
        // System.out.println("your balance is::"+ah1.get_balance());
        person p1 = new person();
        p1 = null;   // now "Alice" object has no reference

        System.gc(); // suggest GC

    }
}
