import java.util.*;
public class Even_or_odd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        char ch = sc.next().charAt(0);
        if(ch=='a'|| ch=='A'|| ch=='b'|| ch=='B'|| ch=='i' || ch=='I'|| ch=='o'|| ch=='O'|| ch=='u'|| ch=='U'){
            System.out.println("Vowel");
        }
        else if(ch=='e'|| ch=='E'){
            System.out.println("Even Vowel");
        }
        else if(ch=='y'|| ch=='Y'){
            System.out.println("Consonant or Vowel");
        }
        else{
            System.out.println("Consonant");
        }
        
    }
}