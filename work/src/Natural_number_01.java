import java.util.Scanner;
    public class Natural_number_01{
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number N: ");
        int N = sc.nextInt();
        int sum =0;
        for (int i=1;i<=N;i++){
            sum=sum+i;
        }
        System.out.println("sum of natural number till" +N+ " is: " +sum);
    }
}   