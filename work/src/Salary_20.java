import java.util.Scanner;
    public class Salary_20 {
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your Salary: ");
        double salary = sc.nextDouble();
        double HRA=0;
        double DA =0;

        if (salary <= 1000){
            HRA = 0.20* salary;
            DA = 0.80 * salary;
        }
        else if (salary <= 20000){
            HRA = 0.25 *salary;
            DA = 0.90 * salary;
        }
        else if (salary >20000){
            HRA = 0.30 *salary;
            DA = 0.95 * salary;
        }
        else{
            System.out.println("Invalid Salary");
        }
        double gross = salary + HRA + DA;
        System.err.println("Your total gross salay is:"+gross);

    }  
}  