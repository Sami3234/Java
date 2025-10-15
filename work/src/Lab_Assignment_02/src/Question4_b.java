import java.util.Scanner;

public class Question4_b {
    public static int min(int x, int y) {
        if (x < y)
            return x;
        else
            return y;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2;
        System.out.print("Enter first number: ");
        n1 = in.nextInt();
        System.out.print("Enter second number: ");
        n2 = in.nextInt();

        System.out.println("Smaller number is: " + min(n1, n2));
        in.close();
    }
}
