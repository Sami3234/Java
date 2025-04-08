import java.util.Scanner;
public class Find_Uppercase_lowercase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Charactor:");
        char ch = sc.next().charAt(0);
        if(ch >='A' && ch<= 'Z'){
            System.out.println("Your Charactor is Uppercase.");
        }
        else if (ch >='a' && ch <='z'){
            System.out.println("Yoor Charactor is Lowercase.");
        }
        else if (ch >= '0' && ch <= '9'){
            System.out.println("Your Charactor is digit.");
        }
        else {
            System.out.println("Your entry is Worng");
        }
        
    }
}