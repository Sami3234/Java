public class manager extends Emoloyee {
    String dept;
    manager(String n, int s , String d){
        super(n,s);
        dept =d;
        System.out.println("Your depertment is "+dept);
    }
}
