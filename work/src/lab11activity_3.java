import java.util.*;

public class lab11activity_3 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int array[] = { 11, 5, 8, 3, 21, 7, 66, 33, 31, 90 };
        int choice = 1;
        while (choice == 1) {
            try {
                System.out.print("Enter an integer value to search in array:");
                int n = input.nextInt();
                System.out.print("Enter the index of the array: ");
                int index = input.nextInt();
                if (array[index] == n)
                    System.out.println("You won");
                else
                    System.out.println("You Lost");
                System.out.println("Do you want to continue...(press 1 for YES and 0 for No)");
                choice = input.nextInt();
                if (choice == 0)
                    break;

            } catch (IntputMismatchException ex) {
                System.out.println("You have entered an invalid input type");
                System.out.println("Try Again");
                input.nextLine();
            } catch (ArrayIndexOutOfBoundsException ex2) {
                System.out.println("You have entered an invaild index");
                System.out.println("Try Again");
                input.nextLine();
            }
        }
    }
}
