import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String a=sc.nextLine();
        System.out.println("Enter your age: ");
        int b=sc.nextInt();
        System.out.println("This is your name :: "+a);
        System.out.println("This is your age :: "+b);
        sc.close();
    }
}
