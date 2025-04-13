import java.util.Scanner;
    public class Armstrong_03{
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Number for Check Armstrong: ");
        int num =sc.nextInt();
        int orgnum = num;
        int sum =0;
        while (num >0){
            int digit = num %10;
            sum += digit*digit*digit;
            num = num / 10;
        }
        if (sum == orgnum){
            System.out.println("Your number is Armstrong.");
        }
        else{
            System.out.println("Your number is nor Armstrong.");
        }
    }       
       
}