import java.util.Scanner;

public class Sppose_number {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println(System.in);
        int limit;
        int number;
        int sum;
        int counter;
        System.out.print("Enter the number of " + "interger in the list:");
        limit = console.nextInt();
        System.out.println();
        sum = 0;
        counter = 0;
        System.out.println("Enter" + limit + " intergers.");
        while (counter < limit) {
            number = console.nextInt();
            sum = sum + number;
            counter++;
        }
        System.out.printf("the sum of %d " + "numbers = %d%n", limit, sum);
        if (counter != 0)
            System.out.printf("The average = %d%n", (sum / counter));
        else
            System.out.println("No numbers were entered.");
    }
}