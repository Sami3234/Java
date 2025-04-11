import java.util.Scanner;
    public class devesion_check {
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a=sc.nextInt();
        if(a%5==0 && a%11==0){
            System.out.println("Your number is divisiable");
        }
        else{
            System.out.println("Your number is not divisiable");
        }
    
        }

    }
