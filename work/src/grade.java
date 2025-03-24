import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks in Phy : ");
        int phy = sc.nextInt();
        System.out.println("Enter the marks in Chem : ");
        int chem = sc.nextInt();
        System.out.println("Enter the marks in Math : ");
        int math = sc.nextInt();
        System.out.println("Enter the marks in Bio : ");
        int bio = sc.nextInt();
        System.out.println("Enter the marks in Comp : ");
        int comp = sc.nextInt();
        System.out.println("Total marks is 500 : "); 
        int total = phy+chem+math+bio+comp;
        System.out.println("Your Obtain marks : " +total);
        double percentage = (total/500.0)*100;
        System.out.println("Your percentage is : "+percentage+"%");
        if (percentage >= 90){
            System.out.println("Your grade is A");
        }
        else if (percentage >= 80){
            System.out.println("Your grade is B");
        }
        else if (percentage >=70){
            System.out.println("Your grade is C");
        }
        else if (percentage >=60){
            System.out.println("Your grade is D");
        }
        else if (percentage >=40){
            System.out.println("Your grade is E");
        }
        else {
            System.out.println("Your grade is F");
        }
        sc.close();
    }
}