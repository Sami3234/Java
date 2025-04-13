import java.util.Scanner;
    public class Natural_number_between_02{
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a first number N: ");
        int N1 = sc.nextInt();
        System.out.println("Enter a second number N: ");
        int N2 = sc.nextInt();
        int sum=0;
        for(int i=N1;i<=N2;i++){
            sum = sum+i;
        }
        System.out.println("Sum of between natural number till "+N2+" is:: "+sum);
    }   
}   