import java.util.Scanner;
public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Reg No :: ");
        int reg = sc.nextInt();
        sc.close();
        if (reg >= 50) {
            System.out.println("Your Section is A");
        } else {
            System.out.println("your section is B");
        }
    }
}
