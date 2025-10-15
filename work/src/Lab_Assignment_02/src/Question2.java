import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double l1, w1, l2, w2, area1, area2;

        System.out.print("Enter length of 1st rectangle: ");
        l1 = in.nextDouble();
        System.out.print("Enter width of 1st rectangle: ");
        w1 = in.nextDouble();

        System.out.print("Enter length of 2nd rectangle: ");
        l2 = in.nextDouble();
        System.out.print("Enter width of 2nd rectangle: ");
        w2 = in.nextDouble();

        area1 = l1 * w1;
        area2 = l2 * w2;

        if (area1 > area2)
            System.out.println("First rectangle has greater area.");
        else if (area2 > area1)
            System.out.println("Second rectangle has greater area.");
        else
            System.out.println("Both rectangles have same area.");

        in.close();
    }
}
