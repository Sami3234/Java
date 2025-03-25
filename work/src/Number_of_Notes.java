import java.util.Scanner;
    public class Number_of_Notes{
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Amount : ");
        int amount = sc.nextInt();
        int notes5000 = amount/5000;
        amount %= 5000;
        int notes1000 = amount/1000;
        amount %= 1000;
        int notes500 = amount/500;
        amount %= 500;
        int notes100 = amount/100;
        amount %= 100;
        int notes50 = amount/50;
        amount %= 50;
        int notes20 = amount/20;
        amount %= 20;
        int notes10 = amount/10;
        amount %=10;
        int notes5 = amount/5;
        amount %=5;
        int notes2 = amount/2;
        amount %=2;
        int notes1 = amount;
        System.out.println("In your Amount 5000 notes is : "+notes5000);
        System.out.println("In your Amount 1000 notes is : "+notes1000);
        System.out.println("In your Amount 500 notes is : "+notes500);
        System.out.println("In your Amount 100 notes is : "+notes100);
        System.out.println("In your Amount 50 notes is : "+notes50);
        System.out.println("In your Amount 20 notes is : "+notes20);
        System.out.println("In your Amount 10 notes is : "+notes10);
        System.out.println("In your Amount 5 notes is : "+notes5);
        System.out.println("In your Amount 2 notes is : "+notes2);
        System.out.println("In your Amount 1 notes is : "+notes1);
         
        sc.close();
    }
}