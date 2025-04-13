import java.util.Scanner;
    public class Table_natural_07{
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num =10;
        for(int i=1;i<=num;i++){
            System.out.println("Table is ::"+i);
            for(int j=1;j<=num;j++){
                System.out.println(+i+" * "+j+" = "+i*j);
            }
        }
        }

    }
