
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int books, points = 0;

        System.out.print("Enter number of books purchased: ");
        books = in.nextInt();

        if (books == 0)
            points = 0;
        else if (books == 1)
            points = 5;
        else if (books == 2)
            points = 15;
        else if (books == 3)
            points = 30;
        else if (books >= 4)
            points = 60;

        System.out.println("Books: " + books);
        System.out.println("Points earned: " + points);

        in.close();
    }
}