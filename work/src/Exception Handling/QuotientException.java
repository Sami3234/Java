import java.util.Scanner;

public class QuotientException {
    public static int quotient(int n1, int n2) {
        if(n2==0){
            System.out.println("Oh no, Denominator is 0, Please enter 2nd number other than zero.");
            System.exit(0);
        }
        return n1 / n2;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 2 Integres: ");
        int n1 = obj.nextInt();
        int n2 = obj.nextInt();
        int qv = quotient(n1, n2);
        System.out.printf("Quotient of %d/%d is %d", n1, n2, qv);
    }
}
