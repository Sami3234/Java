import java.util.Scanner;
    public class Table_forloop_04{
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number for table. : ");
        int num = sc.nextInt();
        for(int i = 1 ; i<=10 ; i++){
            System.err.println(+num+" * "+i+" = "+num*i);
        }

    }
}