import java.util.Scanner;
import java.util.InputMismatchException;
public class chapter11 {
    public static void main(String[] args) {
// 11.21 (Catching Exceptions Using Outer Scopes)
Scanner input = new Scanner(System.in);
try {
    System.out.println("Enter Nominator and Denominator: ");
    int nom = input.nextInt();
    int denom = input.nextInt();
    someMethod(nom, denom);
}catch (ArithmeticException e) {
    System.out.println("Arithmetic Exception Handled in main.");} 
catch (InputMismatchException e) {
    System.out.println("Input MisMatch Excetion Handled in Main.");
    e.printStackTrace();}}
public static void someMethod(int n1, int n2) {
    try {
        someMethod2(n1, n2);
    } catch (ArithmeticException e) {
        System.out.println("Arithmetic Exception Handled in method.");}}
public static int someMethod2(int n1,int n2) {
        return n1/n2;}}
























// 11.18 (Order of catch Blocks matters)
// Scanner hashir = new Scanner(System.in);
// System.out.println("Enter Nominator and Denominator: ");
// int nom = hashir.nextInt();
// int denom = hashir.nextInt();
// try {
//     quotient(nom, denom);
// } catch (Exception e) {
//     System.out.println("Excption Handled.");
// } catch (ArithmeticException e){
//     System.out.println("Caught Arithmetic Exception.");}
// }public static int quotient(int n1, int n2){
//         return n1/n2;}}


// 11.20 (Rethrowing Exceptions)
// try {
//     someMethod();
// } catch (Exception e) {
//     e.printStackTrace();}
// }public static void someMethod2() throws Exception{
//         throw new Exception();}
// public static void someMethod() throws Exception{
//     try {
//         someMethod2();
//     } catch (Exception exception) {
//         System.out.println("Excption Handled.");
//         throw exception;}}}


