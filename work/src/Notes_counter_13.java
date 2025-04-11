import java.util.Scanner;
    public class Notes_counter_13{
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the amount: ");
        long amount = sc.nextLong();

        long n5000 = 0, n1000 = 0, n500 = 0, n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0, n1 = 0;
        if(amount>=5000){
            n5000 =amount/5000;
            amount=amount%5000;
        }
        if(amount>=1000){
            n1000 =amount/1000;
            amount=amount%1000;
        }
        if(amount>=500){
            n500 =amount/500;
            amount=amount%500;
        }
        if(amount>=100){
            n100 =amount/100;
            amount=amount%100;
        }
        if(amount>=50){
            n50 =amount/50;
            amount=amount%50;
        }
        if(amount>=20){
            n20 =amount/20;
            amount=amount%20;
        }
        if(amount>=10){
            n10 =amount/10;
            amount=amount%10;
        }
        if(amount>=5){
            n5 =amount/5;
            amount=amount%5;
        }
        if(amount>=2){
            n2 =amount/2;
            amount=amount%2;
        }
        if(amount>=1){
            n1 = amount;
        }
        System.out.println("In your Amount Notes:");
        if(n5000>0)System.out.println("5000 = "+n5000);
        if(n1000>0)System.out.println("1000 = "+n1000);
        if(n500>0)System.out.println("500 = "+n500);
        if(n100>0)System.out.println("100 = "+n100);
        if(n50>0)System.out.println("50 = "+n50);
        if(n20>0)System.out.println("20 = "+n20);
        if(n10>0)System.out.println("10 = "+n10);
        if(n5>0)System.out.println("5 = "+n5);
        if(n2>0)System.out.println("2 = "+n2);
        if(n1>0)System.out.println("1 = "+n1);
        sc.close();
  }
}