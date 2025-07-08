import java.util.Scanner;

public class passbyValue {
    public static void main(String[] args) {
        System.out.println("Enter three Integer Values");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        System.out.println("Before invoking the swap method, num 1 is " + num1 + " and num2 is " + num2);
        System.out.println(
                "Before invoking the swap method, num 1 is " + num1 + " , num2 is " + num2 + " and num3 is " + num3);
        swap(num1, num2);
        swap(num1, num2, num3);
    }

    private static void swap(int num1, int num2) {
        System.out.println("\n Welcome to the body of Binary swap method");
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After invoking the swap method, number 1 is " + num1 + " and number 2 is " + num2);
    }

    public static void swap(int num1, int num2, int num3) {
        System.out.println("\n Welcome to the body of ternary swap method");
        int temp = num1;
        num1 = num3;
        num3 = num2;
        num2 = temp;
        System.out.println("After invoking the swap method, number 1 is " + num1 + " , number 2 is " + num2
                + " and number 3 is " + num3);
    }
}