import java.util.Scanner;
    public class profit {
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Buying price: ");
        int a=sc.nextInt();
        System.out.println("Enter a selling  price: ");
        int b=sc.nextInt();
        if(a<b){
            System.out.println("Your profit is ::"+(b-a));
        }
        else if(a>b){
            System.out.println("Your lose:"+(a-b));
        }
        else if(a==b){
            System.out.println("Your Buing and Selling price is Equle.");
        }
        else{                 
        System.out.println("invalid Number");
        }

    }
    }