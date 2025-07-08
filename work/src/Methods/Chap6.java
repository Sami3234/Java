import java.util.Scanner;
import java.security.SecureRandom;
public class Chap6 {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in); int choice;
SecureRandom random = new SecureRandom();
do{
int userGuess=0, numToGuess = 1+random.nextInt(1000);
while (userGuess!=numToGuess) {
System.out.print("Enter your Guess: ");
userGuess = input.nextInt();
if(userGuess==numToGuess) {
    System.out.println("Congratulations. You guessed the number!");}
else if (userGuess>numToGuess){ 
    System.out.println("Too High!.Try Again");}
else {
    System.out.println("Too Low!.Try Again");}
}
System.out.print("1. to play again\n2. for Exit: ");
choice = input.nextInt(); 
}while(choice!=2);}
}
// Problem 6.8 (Charges Calculator)
// Scanner hashir = new Scanner(System.in);
// double totalRecipts = 0; int moreCustomers=0;
// do {
// System.out.print("Enter the hours Parked: ");
// double hoursParked = hashir.nextDouble();
// double totalCharges = calculateCharge(hoursParked);
// System.out.printf("The Total Charge is : %.2f",totalCharges);
// totalRecipts += totalCharges;
// System.out.print("\nAre there more Customers? 1. for Yes 2.for No: ");
// moreCustomers = hashir.nextInt();} while (moreCustomers == 1);
// System.out.printf("The Total receipt of yesterday is %.2f",totalRecipts);}
// public static double calculateCharge(double hours) {
// double charges = 2;
// if(hours>3){
// charges += Math.ceil(hours-3)*0.5;}
// if(charges>10){
// charges = 10;}
// return charges;}}

// Problem 6.9
// Scanner hashir = new Scanner(System.in);
// double n,roundedNum;
// while (true){
// System.out.print("Enter the Number: ");
// n = hashir.nextDouble();
// roundedNum = Math.floor(n + 0.5);
// if(n == 0) break;
// System.out.printf("The Orignal number is %f",n);
// System.out.printf("\nThe Rounded number is %f\n",roundedNum);}}}

// Problem 6.10
// Scanner hashir = new Scanner(System.in);
// double n,roundedNum,roundedHund,roundedTens,roundedThsnd;
// while (true){
// System.out.print("Enter the Number: ");
// n = hashir.nextDouble();
// roundedNum = Math.floor(n + 0.5);
// roundedTens = Math.floor(n*10 + 0.5)/10;
// roundedHund = Math.floor(n*100+ 0.5)/100;
// roundedThsnd = Math.floor(n*1000+ 0.5)/1000;
// if(n == 0) break;
// System.out.printf("The Orignal number is %f",n);
// System.out.printf("\nRounded to Nearest Integer: %f\n",roundedNum);
// System.out.printf("Rounded to Tenth: %f\n",roundedTens);
// System.out.printf("Rounded to Hundredth: %f\n",roundedHund);
// System.out.printf("Rounded to Thousandth: %f\n",roundedThsnd);}}}

// Problem 6.14 (Power Calculation)
// Scanner hashir = new Scanner(System.in);
// int n, power;
// System.out.print("Enter the Number: ");
// n = hashir.nextInt();
// System.out.print("Enter the power: ");
// power = hashir.nextInt();
// int displayPower = integerPower(n,power);
// System.out.printf("The Value is %d",displayPower);}
// public static double integerPower(int number, int pow){
// int val = number;
// for(int i = 1; i<pow; i++){
// val *= number;}
// return val;}}

// Problem 6.15 (Hypotenuse Calculation)
// Scanner hashir = new Scanner(System.in);
// double side1, side2, side3;
// System.out.println("Enter the value of Base and Then Prependicular: ");
// side1 = hashir.nextDouble(); side2 = hashir.nextDouble();
// double hypo = hypotenuse(side1,side2);
// System.out.printf("The Hypotenuse of Right Angled Triangle is: %.2f",hypo);}
// public static double hypotenuse(double base, double prependicular){
// double hypt = Math.sqrt(Math.pow(prependicular,2) + Math.pow(base,2));
// return hypt;}}

// Problem 6.16 (Determining Multiples)
// Scanner hashir = new Scanner(System.in);
// double num1, num2;
// do{
// System.out.println("Enter 2 Integers: ");
// num1 = hashir.nextInt(); num2 = hashir.nextInt();
// boolean res = isMultiple(num1, num2);
// if(res){
// System.out.printf("%d is Multiple of %d\n",num2,num1);}
// else{
// System.out.printf("%d is not Multiple of %d\n",num2,num1);
// }}while(num2!=-1);}
// public static boolean isMultiple(double num1, double num2){
// if(num2%num1==0) return true;
// else return false;}}

// Problem 6.17 (Even or Odd)
// Scanner hashir = new Scanner(System.in);
// char moreNumbers;
// do {
// System.out.print("Enter an integer: ");
// double number = hashir.nextInt();
// if (isEven(number)) {
// System.out.printf("%d is even.%n", number);}
// else {
// System.out.printf("%d is odd.%n", number);}
// System.out.print("Do you want to check another number? (y/n): ");
// moreNumbers = scanner.next().charAt(0);
// } while (moreNumbers == 'y' || moreNumbers == 'Y');}
// public static boolean isEven(double number) {
// return number % 2 == 0; }}

// Problem 6.18 (Print Square of *)
// Scanner hashir = new Scanner(System.in); double n;
// System.out.print("Enter the Number: ");
// n = hashir.nextInt();
// squareOfAsterisks(n);}
// public static void squareOfAsterisks(double num){
// for(double i=1; i<=num; i++){
// for(double j=1; j<=num;j++){
// System.out.print("*");}
// System.out.println();}}}

// Problem 6.19 (Print Square of Any character)
// Scanner hashir = new Scanner(System.in); double n;
// System.out.print("Enter the Number: ");
// n = hashir.nextInt();
// System.out.print("Enter Single Character: ");
// char fill = hashir.next().charAt(0);
// squareOfAsterisks(n,fill);}
// public static void squareOfAsterisks(double num,char f){
// for(double i=1; i<=num; i++){
// for(double j=1; j<=num;j++){
// System.out.print(f);}
// System.out.println();}}}

// Problem 6.20 (Calculate Area)
// Scanner hashir = new Scanner(System.in);
// double radius;
// System.out.print("Enter Radius: ");
// radius = hashir.nextDouble();
// double area = circleArea(radius);
// System.out.printf("The Area of circle is: %.2f",area);}
// public static double circleArea(double rad){
// return 3.1429*rad*rad;}}

// // Problem 6.21 (Separating Digits)
// Scanner hashir = new Scanner(System.in);
// System.out.print("Enter an integer between 1 and 99999: ");
// double num = hashir.nextInt();displayDigits(num);}
// public static double quotient(double num1, double num2) {
// return num1 / num2;}
// public static double remainder(double num1, double num2) {
// return num1 % num2;}
// public static void displayDigits(double number) {
// double divisor = 1;
// while (number / divisor >= 10) { // Find the divisor to extract the first
// digit
// divisor *= 10;}
// while (divisor > 0) {// Separate each digit and display it
// double digit = quotient(number, divisor);// Extract the leading digit
// System.out.print(digit + " "); // Separate digits by two spaces
// number = remainder(number, divisor);// Remove the leading digit from the
// number
// divisor /= 10;}// Reduce the divisor by num1 factor of 10 for the next digit
// System.out.println();}}

// Problem 6.22 (Temperature Conversion)
// Scanner hashir = new Scanner(System.in);
// double cel=0, far=0; double choice;
// System.out.print("1.Celcuis to Fahrenhiet\t2.Fahrenhiet: "); choice =
// hashir.nextInt();
// if(choice==1){
// System.out.print("Enter Temperature in Celcius: "); cel =
// hashir.nextDouble();}
// else if(choice==2){
// System.out.print("Enter Temperature in Fahrenheit: ");far =
// hashir.nextDouble();}
// else {System.out.println("Invalid Input!"); return;} double conv =
// celfar(far, cel, choice);
// if (choice == 1) {
// System.out.printf("Temperature in Fahrenheit: %.2f%n",conv);}
// else if (choice == 2) {
// System.out.printf("Temperature in Celsius: %.2f%n",conv);}}
// public static double celcius(double f){
// return 5.0 / 9.0 * (f - 32);}
// public static double fahrenheit(double c){
// return 9.0 / 5.0 * c + 32;}
// public static double celfar(double f, double c,double cho){
// double con;
// if (cho==1) return con = fahrenheit(c);
// else if(cho==2) return con = celcius(f); else return 0;}}

// Problem 6.23 (Find Minimum)
// Scanner hashir = new Scanner(System.in);
// double num1,num2,num3;
// System.out.println("Enter three Floating numbers:");
// num1 = hashir.nextDouble(); num2 = hashir.nextDouble();
// num3 = hashir.nextDouble();
// double num = minimum3(num1,num2,num3);
// System.out.printf("The Minimum number is %.2f",num);}
// public static double minimum3(double n1, double n2, double n3){
// double min = n1;
// if (n2<min) min = n2;
// if (n3<min) min = n3; return min;}}

// Problem 6.24 (Perfect Number Program)
// for(double num=1; num<=1000; num++){
// boolean res = isPerfect(num);
// if(res) System.out.printf("%d is Perfect Number\n",num);
// factors(num, res);}}
// public static boolean isPerfect(double num1){
// double n=0;
// for(double i = 1; i<num1; i++){
// if(num1%i==0){
// n+=i;}}
// if (n==num1) return true;
// else return false;}
// public static void factors(double num1, boolean res){
// if(res){
// for(double i = 1; i<num1; i++){
// if(num1%i==0){
// System.out.print(i+" ");}}
// System.out.printf("are the Factors of %d",num1);}}}

// Problem 6.25 (Reversing Digit)
// Scanner input = new Scanner(System.in);
// System.out.print("Enter a Number: ");
// int num = input.nextInt();
// int revNum = reverseDigit(num);
// System.out.printf("The reverse of %d is %d",num,revNum);
// }public static int reverseDigit(int n){
// int rem, reverse=0;
// while(n>0){
// rem = n%10;
// reverse = (reverse*10)+rem;
// n/=10;}
// return reverse;}}

// Problem 6.26 (Prime Numbers)
// Scanner hashir = new Scanner(System.in);
// System.out.print("Enter num1 Number: ");
// double num = hashir.nextInt();
// boolean prime = primeNumber(num);
// if(prime) System.out.printf("The %d Number is Prime",num);
// else System.out.printf("%d is not prime",num);
// }public static boolean primeNumber(double n){
// boolean pri = true;
// for(double i=2; i<n; i++){
// if(n%i==0){
// pri = false;
// break;}else{
// pri = true;}}
// if(pri) return true;
// else return false;}}

// Problem 6.27 (Greatest Common Divisor)
// Scanner hashir = new Scanner(System.in);
// System.out.print("Enter 1st Number: ");
// double n1 = hashir.nextInt();
// System.out.print("Enter 2nd Number: ");
// double n2 = hashir.nextInt();
// double gcd = GCD(n1,n2);
// System.out.printf("GCD of %d and %d is %d",n1,n2,gcd);}
// public static double GCD(double num1,double num2){
// // if(num2==0) return num1;
// // return GCD(num2,num1%num2); OR
// while(num2!=0){
// double temp = num2;
// num2 = num1%num2;
// num1 = temp;}return num1;}}

// Problem 6.28 (Student's qualityPoints)
// Scanner input = new Scanner(System.in);
// System.out.print("Enter the Average of Student: ");
// double avgofStudent = input.nextDouble();
// int qPoints = qualityPoints(avgofStudent);
// System.out.printf("Student's Quality Points are %d",qPoints);}
// public static int qualityPoints(double avg){
// if(avg<=100 && avg>=90) return 4;
// else if (avg<90 && avg>=80) return 3;
// else if (avg<80 && avg>=70) return 2;
// else if (avg<70 && avg>=60) return 1;
// else return 0;}}

// import java.util.Scanner; import java.security.SecureRandom;
// public class Chap5 {
// private static enum Coin{HEADS,TAILS}
// public static void main(String[] args) {
// //Problem 6.29 (Coin Tossing)
// Scanner hashir = new Scanner(System.in); double choice, heads=0,tails=0;
// do{
// System.out.println("Menu...");
// System.out.print("1. for Coin Toss\n2. for Exit: ");
// choice = hashir.nextInt();
// if(choice==1){
// Coin result = flip();
// if(result == Coin.HEADS){ System.out.print("Result: HEADS\n"); heads++;}
// else{ System.out.print("Result: TAILS\n"); tails++;}}}while(choice!=2);
// System.out.printf("HEADS: %d\nTAILS: %d",heads,tails);}
// public static Coin flip() {
// SecureRandom random = new SecureRandom();
// boolean toss = random.nextBoolean();
// if(toss) return Coin.HEADS;
// else return Coin.TAILS;}}

// Problem 6.30 (Guess Number)
// Scanner hashir = new Scanner(System.in); double choice;
// SecureRandom random = new SecureRandom();
// do{
// double userGuess=0, numToGuess = 1+random.nextInt(1000);
// while (userGuess!=numToGuess) {
// System.out.print("Enter your Guess: ");
// userGuess = hashir.nextInt();
// if(userGuess==numToGuess) System.out.println("Congratulations.You guessed the
// number!");
// else if (userGuess>numToGuess) System.out.println("Too High!.Try Again");
// else System.out.println("Too Low!.Try Again");
// }System.out.print("1. to play again\n2. for Exit: ");
// choice = hashir.nextInt(); }while(choice!=2);}}

// Problem 6.31 (Distance betwee two points)
// Scanner hashir = new Scanner(System.in);
// System.out.println("Enter X-Coordinates: ");
// double x1 = hashir.nextInt(), x2 = hashir.nextInt();
// System.out.println("Enter Y-Coordinates: ");
// double y1 = hashir.nextInt(), y2 = hashir.nextInt();
// double distance = Distance(x1,x2,y1,y2);
// System.out.printf("Distance between these points is %.2f",distance);}
// public static double Distance(double x1,double x2,double y1,double y2){
// double dis = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
// return dis;}}

// Problem 6.34(Table of Binary, Octal and Hexadecimal Number)
// System.out.printf("%-10s %-10s %-10s %-10s%n", "Decimal", "Binary", "Octal",
// "Hexadecimal");
// System.out.println("-----------------------------------------------------");
// for (int decimal = 1; decimal <= 256; decimal++) {
// // Convert to binary, octal, and hexadecimal
// String binary = Integer.toBinaryString(decimal);
// String octal = Integer.toOctalString(decimal);
// String hex = Integer.toHexString(decimal).toUpperCase();
// // Print the conversions in table format
// System.out.printf("%-10d %-10s %-10s %-10s%n", decimal, binary, octal,
// hex);}}}

// Problem 6.35 (Computer-Assisted Instruction)
// Scanner hashir = new Scanner(System.in);
// SecureRandom random = new SecureRandom();
// multiplicationQuiz(hashir,random);
// }public static void multiplicationQuiz(Scanner hashir,SecureRandom random){
// int n1 = 1+random.nextInt(9);
// int n2 = 1+random.nextInt(9);
// System.out.printf("What is %d time %d?: ",n1,n2);
// int ans = n1*n2;
// int studentGuess = hashir.nextInt();
// while (studentGuess!=ans) {
// System.out.print("No Try again!\n");
// studentGuess = hashir.nextInt();}
// System.out.print("Very Good!");}}