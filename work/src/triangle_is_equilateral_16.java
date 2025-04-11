import java.util.Scanner;
    public class triangle_is_equilateral_16 {
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter value side a: ");
        int a = sc.nextInt();
        System.out.println("Enter value side b: ");
        int b = sc.nextInt();
        System.out.println("Enter value side c: ");
        int c = sc.nextInt();
        if (a + b > c && a + c > b && b + c >a){
            if(a==b && b==c ){
                System.out.println("Equilateral Triangle");
            }
            else if (a == b || b == c || a == c){
                System.out.println("Isoscale triangle");
            }
            else{
                System.out.println("Sclane Triangle");
            }
        }
        else{
            System.out.println("Invalid Entry");
        }

    }
}  