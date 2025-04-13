import java.util.Scanner;
    public class Even_forloop_05{
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Number for print Even number : ");
        int n=sc.nextInt();
        int sum=0;
        for (int i=0 ; i<=n ; i++){
            if(i%2==0){
                System.out.println(+i);
                sum+=i;
            }
            
        }
        System.out.println("Your All Even numbr sum : "+sum);
    }
}