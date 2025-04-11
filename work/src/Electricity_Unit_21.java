import java.util.Scanner;
    public class Electricity_Unit_21{
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Electricity Units: ");
        int  units = sc.nextInt();
        double bill=0.0;
        if (units <=50){
            bill = 0.50*units;
        }
        else if (units <=150){
            bill =  50 * 0.50 + (units - 50)*0.75;
        }
        else if (units <= 250){
            bill = 50* 0.50 + 100 *0.75 +(units - 100)* 1.20;
        }
        else if (units > 250){
            bill = 50 * 0.50 + 100 *0.75 + 100 *1.20+ (units - 100)*1.50;
        }
        else{
            System.out.println("Your units is Zero");
        }
        double surcharge = bill * 0.20;
        double total = bill + surcharge;
        System.out.println("Your total bill is with out Surcharges  :"+bill);
        System.out.println("Your total bill is with 20% Surcharges:"+total);
    } 
}