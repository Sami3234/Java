import java.util.Scanner;
    public class triangle_with_side_15{
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter value side a: ");
        int a = sc.nextInt();
        System.out.println("Enter value side b: ");
        int b = sc.nextInt();
        System.out.println("Enter value side c: ");
        int c = sc.nextInt();

        if (a+b>c && a+c>b && b+c>a){
            System.out.println("Your trangle is valid.");
        }
        else{
            System.out.println("Your triangle is not valid.");
        }

    }
}  