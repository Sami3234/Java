import java.util.Scanner;
    public class Max_or_Mini_three {
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a First Number: ");
        int a=sc.nextInt();
        System.out.println("Enter a Second Number;");
        int b=sc.nextInt();
        System.out.println("Enter a Third Number;");
        int c=sc.nextInt();
        if(a>b && a<c){
            System.out.println("Maximum Number is "+a);
        }
        else if (b>a && b>c){
            System.out.println("Maximum Number is "+b);
        }
        else if (c>a && c>b){
            System.out.println("Maximum Number is "+c);
        }
        else if(a==b || a==c){
            System.out.println("All Number is Equal "+a+ " = " +b+ " = " +c);
        }
        else{
            System.out.println("Invalid Input");
        }
        
        }

    }
