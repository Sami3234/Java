import java.util.Scanner;
    public class Grade_19 {
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter marks phy: ");
        int phy = sc.nextInt();
        System.out.println("Enter marks che: ");
        int che = sc.nextInt();
        System.out.println("Enter marks math: ");
        int math = sc.nextInt();
        System.out.println("Enter marks comp: ");
        int comp = sc.nextInt();
        System.out.println("Enter marks bio: ");
        int bio = sc.nextInt();
        double total=phy+che+math+comp+bio;
        System.out.println("Your total marks is: "+total+"/500");
        double per= (total/500)*100;
        System.out.println("Your total Percentage is: "+per+"%");
        if (per >= 90){
            System.out.println("Your Grade is A");
        }
         else if (per >= 80){
            System.out.println("Your Grade is B");
        }
        else if (per >= 70){
            System.out.println("Your Grade is c");
        }
        else if (per >= 60){
            System.out.println("Your Grade is D");
        }
        else if (per >= 50){
            System.out.println("Your Grade is E");
        }
        else if (per < 50){
            System.out.println("Your Grade is F");
        }
        else {
            System.out.println("Your input is invalid");
        }
    }
}  