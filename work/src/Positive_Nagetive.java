import java.util.Scanner;
public class Positive_Nagetive {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        if(num==0){
            System.out.println("Zero");

        }
        else if(num>0){
            System.out.println("Your Number is Positive");
            
        }
        else{
            System.out.println("Your Number is Nagetive");
        }
        
    }
}