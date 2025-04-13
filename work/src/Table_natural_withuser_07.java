import java.util.Scanner;
    public class Table_natural_withuser_07{
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a natural N :: ");
        int N = sc.nextInt();
        int sum=N+9;
        for(int i=N;i<=sum;i++){
            System.out.println("Table of :: "+i);
            for (int j=N;j<=sum;j++){
                System.out.println(+i+ " * " +j+ " = "+i*j);
            }
        } 
            }
        }