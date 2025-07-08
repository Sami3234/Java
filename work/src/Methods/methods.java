import java.util.Scanner;

public class methods {

    public static double Product(double n1, double n2, double n3) {
        double pro = n1 * n2 * n3;
        return pro;
    }

    public static double maximum(double n1, double n2, double n3) {
        double max = n1;
        if (n1 > max) {
            System.out.println("max is = " + n1);
        } else if (n2 > max) {
            System.out.println("max is = " + n2);
        } else {
            System.out.println("max is = " + n3);
        }
        return max;
    }

    public static double sum_method(double num1, double num2, double num3) {
        double resultsum;
        resultsum = num1 + num2 + num3;
        return resultsum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three floating point values: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        double max = maximum(num1, num2, num3);
        double resultsum = sum_method(num1, num2, num3);
        double pro = Product(num1, num2, num3);
        System.out.println("\nThe maximum number is %3f" + max);
        System.out.println("\nThe sum of the numbers is %3f" + resultsum);
        System.out.println(+pro);
    }
}
