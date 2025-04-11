import java.util.Scanner;
public class Quadratic_equation_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter root a: ");
        double a = sc.nextDouble();
        System.out.println("Enter root b: ");
        double b = sc.nextDouble();
        System.out.println("Enter root c : ");
        double c = sc.nextDouble();
        double D= b*b-4*a*c;
        if (D>=0){
            double root1= (-b+ Math.sqrt(D))/2*a;
            double root2 = (-b - Math.sqrt(D))/2*a;
            if (D>0){
                System.out.println("Two real and different Root");
            }
            else {
                System.out.println("Two real and same Roots.");
            }
            System.out.println("root1 +"+root1);
            System.out.println("root2 +"+root2);
        }
        else {
            double realpart = -b/2*a;
            double imagpart = Math.sqrt(-D)/2*a;
            System.out.println("Complex Roots");
            System.out.println("Root1"+realpart+"+"+imagpart+"i");
            System.out.println("Root2"+realpart+"-"+imagpart+"i");

        }
        
    }  
}