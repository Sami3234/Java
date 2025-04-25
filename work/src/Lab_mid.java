import java.util.Scanner;

public class Lab_mid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Units: ");
        int units = sc.nextInt();

        int bill = 0;

        if (units <= 50) {
            bill = units * 4;
        } else if (units <= 350) {
            bill = (50 * 4) + (units - 50) * 15;
        } else if (units <= 750) {
            bill = (50 * 4) + (300 * 15) + (units - 350) * 20;
        } else if (units > 750) {
            bill = (50 * 4) + (300 * 15) + (400 * 20) + (units - 750) * 30;
        } else {
            System.out.println("Invalid input, please enter a valid number of units.");
        }

        double surcharge = 0.20 * bill;
        double totalbill = bill + surcharge;

        System.out.println("Your bill without surcharge: " + bill);
        System.out.println("Your total bill with 20% surcharge is: " + totalbill);

        sc.close();
    }
}