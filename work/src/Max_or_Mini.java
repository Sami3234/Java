import java.util.Scanner;
    public class Max_or_Mini {
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a First Number: ");
        int a=sc.nextInt();
        System.out.println("Enter a Second Number;");
        int b=sc.nextInt();
        if(a>b){
            System.out.println("Maximum Number is "+a);
        }
        else if (a<b){
            System.out.println("Maximum Number is "+b);
        }
        else if(a==b){
            System.out.println("Both Number is Equal"+a+"="+b);
        }
        else{
            System.out.println("Invalid Input");
        }
        
        }

    }
