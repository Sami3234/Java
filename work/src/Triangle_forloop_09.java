import java.util.Scanner;
    public class Triangle_forloop_09{
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char N=10;
        for (int i=N;i >=1 ;i--){
            for(int j=1;j<=i;j++){ 
                System.out.print("*");
            }
        System.out.println();
        }
    }
}