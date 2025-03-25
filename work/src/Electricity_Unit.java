import java.util.Scanner;
    public class Electricity_Unit{
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of Units: ");
        int units = sc.nextInt();
        if(units<=50){
            units = units*0.50;
            System.out.println("The total amount is : "+units);
        }
        else if (units<=100){
            units = units*0.75
            System.out.println("The total amount is : "+units);


        }
        
        sc.close();
    }
}