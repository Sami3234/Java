import java.until.Scanner;

public class lab1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Reg No :: ");
        Int reg = sc.nextInt();
        if (reg >= 50) {
            System.out.println("Your Section is A");
        } else {
            System.out.println("your section is B");
        }
    }
}