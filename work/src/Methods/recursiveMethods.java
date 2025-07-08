import java.util.Scanner;
public class recursiveMethods{
    public static void main(String[] agrs){
        Scanner obj = new Scanner(System.in); int num;
        while(true){
        System.out.print("Enter 0 to Exit.\nEnter the Number of which you want to calculate Factorial: ");
        num  = obj.nextInt();
        if(num==0) {
            System.out.println("You Choose to Exit!"); 
            break;}
        if (num<0){
            System.out.println("Enter a Number above Zero.");}
        else{
        long fact = Factorial(num);
        System.out.printf("The Factorial of %d through Recursive Method is %d.\n",num,fact);
        long recFact = Iterativefact(num);
        System.out.printf("The Factorial of %d through Iterative Method is %d.\n",num,recFact);}
    }}
    public static long Factorial(int n){
        if (n==1 || n==0)
            return 1;
        return n*Factorial(n-1);}
    public static long Iterativefact(int n){
        long fact = 1;
        if(n==1){
            return fact;}
        for(int i=1; i<=n; i++){
            fact *= i;}
        return fact;}}