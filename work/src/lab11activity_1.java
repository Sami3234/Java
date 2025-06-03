import java.util.Scanner;

public class lab11activity_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, choice;
        do {
            System.out.print("Enter 1st value ");
            a = input.nextInt();
            System.out.print("Enter 2nd value ");
            b = input.nextInt();
            System.out.print("1:Add\n2:Subtract\n3:Multiply\n4:Divide\n5:Quit\nEnter Your Choice: ");
            choice = input.nextInt();
            try {
                switch (choice) {
                    case 1:
                        System.out.println(a + "+" + b + "=" + (a + b));
                        break;
                    case 2:
                        System.out.println(a + "-" + b + "=" + (a - b));
                        break;
                    case 3:
                        System.out.println(a + "*" + b + "=" + (a * b));
                        break;
                    case 4:
                        System.out.println(a + "/" + b + "=" + (a / b));
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("You have entered an invaild choice");
                }
            } catch (ArithmeticException e) {
                System.out.println("It is divide by Zero exception");
                System.out.println("Try Again...");
            }
        } while (choice != 5);

    }
}
