import java.util.Scanner;
    public class triangle_valid_or_not_14{
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //is main angle dalny hnn not side lengths.
        System.out.println("Enter angle 1: ");
        int angle1=sc.nextInt();
        System.out.println("Enter a angle 1: ");
        int angle2=sc.nextInt();
        System.out.println("Enter angle 3: ");
        int angle3=sc.nextInt();
        int sum = angle1+angle2+angle3;
        if (sum == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0){
            System.out.println("Your Triangle is Valid.");
        }
        else{
            System.out.println("Your Triangle is not Valid.");
        }
      
    }
}  