import java.util.Scanner;
    public class Electricity_Unit{
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of Units: ");
        int units = sc.nextInt();
        double bill = 0.0;

        if (units <= 50) {
            bill = units * 0.50;
        } else if (units <= 150) {
            bill = (50 * 0.50) + ((units - 50) * 0.75);
        } else if (units <= 250) {
            bill = (50 * 0.50) + (100 * 0.75) + ((units - 150) * 1.20);
        } else {
            bill = (50 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((units - 250) * 1.50);
        }

        // Adding surcharge of 20%
        double surcharge = bill * 0.20;
        double totalBill = bill + surcharge;

        System.out.printf("Your electricity bill (before surcharge) is: %.2f%n", bill);
        System.out.printf("Surcharge (20%%): %.2f%n", surcharge);
        System.out.printf("Your total electricity bill is: %.2f%n", totalBill);
        sc.close();
    }
}