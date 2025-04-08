import java.util.Scanner;
public class Find_alfabet_or_not {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Charactor:");
        char ch = sc.next().charAt(0);
        if ((ch >='A' && ch <='Z')||ch >='a' && ch<='z'){
            System.out.println("Your charactor is Alfabets");
        }
        else {
            System.err.println("Your Charactor is Not Alfabet");
        }
       
        
    }
}