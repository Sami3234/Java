import java.util.Scanner;

public class Question4_a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;

        System.out.print("Enter first number: ");
        a = in.nextInt();
        System.out.print("Enter second number: ");
        b = in.nextInt();

        if (a < b)
            System.out.println("Smaller number is: " + a);
        else
            System.out.println("Smaller number is: " + b);

        in.close();
    }
}
