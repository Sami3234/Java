import java.util.Scanner;
    public class Max_or_Mini {
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a First Number: ");
        int first = sc.nextInt();
        System.out.println("Enter a Second Number: ");
        int second = sc.nextInt();
        if(first>second){
            System.out.println("First Number is Maximum :: "+first);
        }else if(first<second)
        {
            System.out.println("Second Number is Maximum :: "+second);
        }
        else
        {
            System.out.println("Both Number are Same");
        }
        } 
    }
    