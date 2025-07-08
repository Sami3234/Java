/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programeall;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author USER
 */
public class Programeall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // char [] cha=new char[10];
        // for(int i=0;i<cha.length;i++){
        // System.out.println("enter the characters"+(i+1));
        // cha[i]=sc.next().charAt(0);
        // }
        //
        // for(int i=0;i<cha.length;i++){
        // int count=0;
        // for(int j=0;j<cha.length;j++){
        // if(cha[i]==cha[j]){
        // count=count+1;
        // }
        // }
        // System.out.println("the character"+cha[i]+"occouremce is"+count);
        // }
        // sc.close();

        // multiple D arra
        // seck of card
        // Random rand=new Random();
        // int[] deck=new int[52];
        // String[] suits={"Spades","Hearts","Dimond","clubs"};
        // String[] ranks={"Ace","2","3","4","5", "6", "7", "8", "9", "10", "jack",
        // "queen", "king"};
        // for(int i=0;i<deck.length;i++){
        // deck[i]=i;
        // }
        // for(int i=0;i<deck.length;i++){
        // int index=rand.nextInt(deck.length);
        // int temp=deck[i];
        // deck[i]=deck[index];
        // deck[index]=temp;
        // }
        // for(int person=1;person<=4;person++){
        // System.out.println("person::"+person);
        // for(int i=(person-1)*4;i<(person*4);i++){
        // String suit=suits[deck[i]/13];
        // String rank=ranks[deck[i]%13];
        // System.out.println("card number "+deck[i]+":"+rank+" of "+suit);
        // }
        // System.out.println();
        // }

        // activity 1
        // Scanner sc = new Scanner(System.in);
        // int[][] array = new int[3][4];
        // for (int i = 0; i < 3; i++) {
        // System.out.println("enter the element of row::" + (i + 1));
        // for (int j = 0; j < 4; j++) {
        // array[i][j] = sc.nextInt();
        // }

        // }
        // System.out.println("the given 2d array is::");
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 4; j++) {
        // System.out.print(array[i][j] + "\t");

        // }
        // System.out.println();
        // }
        // int sum;
        // for (int i = 0; i < 3; i++) {
        // sum = 0;
        // for (int j = 0; j < 4; j++) {
        // sum = sum + array[i][j];
        // }
        // System.out.println("the sum of row " + (i + 1) + " is::" + sum);
        // }
        // }
        // }

        // activity 2
        // public static boolean isPrime(int n){
        // boolean prime=true;
        // for(int i=2;i<n/2;i++){
        // if(n%i==0){
        // prime=false;
        // break;
        // }
        // }
        // return prime;
        // }
        // public static void main(String[] args) {
        // int[][]array={{11,12,13},
        // {14,15,16},
        // {17,18,19}};
        // System.out.println("the 2D array is");
        // for(int i=0;i<3;i++){
        // for(int j=0;j<3; j++){
        // System.out.print(array[i][j]+"\t");
        // }
        // System.out.println();
        // }
        // System.out.println("the prime numbers in 2D");
        // int n=0;
        // for(int i=0;i<3;i++){
        // for(int j=0;j<3;j++){
        // if(isPrime(array[i][j])==true){
        // System.out.println(array[i][j]);
        // n=n+1;
        // }
        // }
        // }
        // System.out.println("total prime numbers::"+n);

        // activity 3
        // public static int [][]transpose(int [][]matrix){
        // int [][]trans=new int[4][3];
        // for(int i=0;i<4;i++){
        // for(int j=0;j<3;j++){
        // trans[i][j]=matrix[j][i];
        // }
        // }
        // return trans;
        // }
        // public static void main(String[] args) {
        // int matrix1[][]={{1,2,3,4},
        // {5,6,7,8},
        // {9,10,11,12}};
        // int matrix2[][]=new int[4][3];
        // System.out.println("orignal matrix is");
        // for(int i=0;i<3;i++){
        // for(int j=0;j<4;j++){
        // System.out.print(matrix1[i][j]+"\t");
        // }
        // System.out.println();
        // }
        // matrix2=transpose(matrix1);
        // System.out.println("transpose of given matrix is");
        // for(int i=0;i<4;i++){
        // for(int j=0;j<3;j++){
        // System.out.print(matrix2[i][j]+"\t");
        // }
        // System.out.println();
        // }

        // activity 04
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[4][4];
        for (int i = 0; i < 4; i++) {
            System.out.println("enter the array element of row" + (i + 1));
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("original matrix is");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();

        }
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    sum = sum + matrix[i][j];
                    break;
                }
            }
        }
        System.out.println("sum of diagonal is" + sum);
    }
}
// multi 2D array
// Scanner sc=new Scanner(System.in);
// int [][]sum=new int[5][6];
// for(int i=0;i<5;i++){
// System.out.println("enter the row"+(i+1));
// for(int j=0;j<6;j++){
// sum[i][j]=sc.nextInt();
// }
// }
// System.out.println("original matrix 2D");
// for(int i=0;i<5;i++){
// for(int j=0;j<6;j++){
// System.out.print(sum[i][j]+"\t");
// }
// System.out.println();
// }
//
// for(int i=0;i<5;i++){
// int sums=0;
// for(int j=0;j<6;j++){
// sums=sums+sum[i][j];
// }
// System.out.println("the sum of row "+(i+1)+" is "+sums);
// }
//

// check mcqs
// char[][]answer = {{'a','b','c','d','a','c','d'},
// {'a','b','c','a','c','d','a'}};
//
// char[] key = {'a','b','c','d','a','b','c'};
// for(int i=0;i<answer.length;i++){
// int count=0;
// for(int j=0;j<answer[i].length;j++){
// if(answer[i][j]==key[j]){
// count=count+1;
// }
//
// }
// System.out.println("student "+(i+1)+" is "+count);
// }

// method
// activity 1
// public static int max(int a,int b){
// int max;
// if(a>b){
// max=a;
// }
// else{
// max=b;
// }
// return max;
// }
// public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
// System.out.println("enter the num1");
// int num1=sc.nextInt();
// System.out.println("enter the num2");
// int num2=sc.nextInt();
// int max_num=max( num1, num2);
// System.out.println("the max num is "+max_num);

// public static void grade(double num){
// if(num>=90){
// System.out.println("Grade A");
// }else if(num>=80){
// System.out.println("Grade B");
// }else if(num>=70){
// System.out.println("Grade c");
// }else if(num>=60){
// System.out.println("Grade d");
// }else if(num>=50){
// System.out.println("pass");
// }else{
// System.out.println("Fail");
// }
// }
//
// public static void main(String[] args) {
// System.out.println("the grade is::");
// grade(15.8);
// System.out.println("the grade is::");
// grade(78.9);

// activity 3
// public static void swap(int num1,int num2){
// System.out.println("before swaping n1 is "+num1+" n2 is "+num2);
// int temp=num1;
// num1=num2;
// num2=temp;
// System.out.println("after swapping n1 is "+num1+" n2 is "+num2);
// }
// public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
// System.out.println("enter the num1");
// int n1=sc.nextInt();
// System.out.println("enter the num2");
// int n2=sc.nextInt();
// System.out.println("before swaping n1 is "+n1+" n2 is "+n2);
// swap(n1,n2);
// System.out.println("after swapping n1 is "+n1+" n2 is "+n2);

// method books
// sum
// Scanner sc=new Scanner(System.in);
// public static int sum(int num1, int num2){
// int result=0;
// for(int i=num1;i<=num2;i++){
// result=result+i;
// }
// return result;
//
// }
// public static void main(String[] args) {
// System.out.println("the sum of num1 to num2 :"+sum(1,10));
// System.out.println("the sum of num1 to num2 :"+sum(1,5));
// System.out.println("the sum of num1 to num2 :"+sum(37,100));

// max num
// public static int max(int a,int b,int c){
// int max;
// if(a>b && a>c){
// max=a;
// }else if(b>a &&b>c){
// max=b;
// }else{
// max=c;
// }
// return max;
// }
// public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
// System.out.println("enter the num1");
// int a=sc.nextInt();
// System.out.println("enter the num2");
// int b=sc.nextInt();
// System.out.println("enter the num 3");
// int c=sc.nextInt();
// int max_num=max(a,b,c);
// System.out.println("the max num is"+max_num);

// coommon divider method
// public static int gcd(int num1, int num2){
// int gcd=1;
// int k=2;
// while(k<=num1 &&k<=num2){
// if(num1%k==0 && num2%k==0){
// gcd=k;
// }
// k=k+1;
// }
// return gcd;
//
// }
// public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
// System.out.println("enter the num1");
// int num1=sc.nextInt();
// System.out.println("enterb the num2");
// int num2=sc.nextInt();
// int gcd_num=gcd(num1,num2);
// System.out.println("the greatesr common number is"+gcd_num);

// Prime num with method
// public static void prime(int num){
// boolean isprime=true;
// if(num<=1){
// isprime=false;
// }else{
// for(int i=2;i<num;i++){
// if(num%i==0){
// isprime=false;
// break;
// }
// }
// }if(isprime){
// System.out.println(num+" is prime num ");
// }else{
// System.out.println(num+" is not prime");
// }
//
// } public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
// System.out.println("enter the num");
// int num=sc.nextInt();
// prime(num);

// prime 1 to 50
// int count=0;
// int num=2;
// while(count<50){
// boolean isprime=true;
// for(int i=2;i<num;i++){
// if(num%i==0){
// isprime=false;
// break;
// }
//
// }
// if(isprime){
// System.out.println(num+" ");
// count=count+1;
// }
// num=num+1;
// }

// overloading method
// public static int sum(int a,int b){
// int result;
// result=a+b;
//
// return result;
// }
// public static int sum(int a,int b,int c){
// int result;
// result=a+b+c;
//
// return result;
// }
// public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
// int a=sc.nextInt();
// int b=sc.nextInt();
// int c=sc.nextInt();
// int sum_num=sum(a,b,c);
// System.out.println("the sum is "+sum_num);
// int result=sum(a,b);
// System.out.println("the sum is "+result);

// maximum num overloading
// public static int max(int a,int b){
// int max;
// if(a>b){
// max=a;
//
// }else{
// max=b;
// }
// return max;
// }
// public static void divide(int a,int b){
// int result=a/b;
// System.out.println("the divison is"+result);
// }
// public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
// System.out.println("enter the num1");
// int num1=sc.nextInt();
// System.out.println("enter the num2");
// int num2=sc.nextInt();
// int result=max(num1,num2);
// System.out.println(result);
// divide(num1,num2);

// sorting numbers
// Scanner sc = new Scanner(System.in);
// int[] array = new int[5];
// for (int i = 0; i < array.length; i++) {
// System.out.println("enter the numbers" + (i + 1));
// array[i] = sc.nextInt();
// }
// for (int i = 0; i < array.length - 1; i++) {
// int minindex = i;
// for (int j = i + 1; j < array.length; j++) {
// if (array[j] < array[minindex]) {
// minindex = j;
// }

// }
// int temp = array[i];
// array[i] = array[minindex];
// array[minindex] = temp;
// }
// System.out.println("sort of numbers");
// for (int i = 0; i < array.length; i++) {

// System.out.println(array[i] + " ");
// }
// }
// }

// Chapter 3
// Scanner sc=new Scanner(System.in);
// System.out.println("enter the num");
// int num=sc.nextInt();
// if(num%5==0){
// System.out.println("hifive");
// }
// if(num%2==0){
// System.out.println("hieven");
// }

// random answer
// Scanner sc=new Scanner(System.in);
// Random rand=new Random();
// int num1=rand.nextInt(10);
// int num2=rand.nextInt(10);
// if(num1<num2){
// int temp=num1;
// num1=num2;
// num2=temp;
// }
// System.out.println(num1+"-"+num2+"=?");
// System.out.println("entwr the answer");
// int answer=sc.nextInt();
// if(answer==(num1-num2)){
// System.out.println("the answer is correct");

// }
// else{
// System.out.println("wrong ! answer is right "+(num1-num2));

// }

// BMI
// Scanner sc=new Scanner(System.in);
// System.out.println("enter the weight");
// double weight=sc.nextDouble();
// System.out.println("enter the height");
// double height=sc.nextDouble();
// double weight_kg=weight*0.45359237;
// double height_m=height*0.0254;
// double bmi=weight_kg/(height_m*height_m);
//
// if(bmi<18.5){
// System.out.println("underweight");
// }else if(bmi<25.0){
// System.out.println("normal");
//
//
// }else if(bmi<30.0){
// System.out.println("overweight");
//
// }else{
// System.out.println("obese");
// }
// System.out.println("the bmi is "+bmi);
//

// fedral personal rate tax
// int choice;
// Scanner sc=new Scanner(System.in);
// System.out.println("1.single\n2.marriage jointly\n3.marriage seprate\n4.hrad
// of house\n5.quite");
// choice=sc.nextInt();
//
// System.out.println("enter the income");
// int income=sc.nextInt();
// double tax=0;
// if(choice==1){
// if(income<=8350){
// tax=8350*.15+(income-8350)*.10;
// }else if(income<=33950){
// tax=8350*.10+33950*.15+(income-33950)*.25;
// }else if(income<=82250){
// tax=8350*.10+(33950-8350)*.15+(82250-33950)*.25+(income-82250)*.28;
// }else if(income<=171550){
// tax=8350*.10+(33950-8350)*.15+(82250-33950)*.25+(171550-82250)*.28+(income-171551)*.33;
// }else if(income<=372950){
// tax=8350*.10+(33950-8350)*.15+(82250-33950)*.25+(171550-82250)*.28+(372950-171551)*.33+(income-372950)*.35;
// }else{
// tax=8350*.10+(33950-8350)*.15+(82250-33950)*.25+(171550-82250)*.28+(372950-171551)*.33+(income-372950)*.35;
// }
//
//
// }if (choice==2){
// System.out.println("the total tax amount is "+tax);
// }

// leap year
// Scanner sc=new Scanner(System.in);
// System.out.println("enter the year");
// int year=sc.nextInt();
// boolean isLeapYear=
// (year%4==0 && year%100!=0 || year%400==0);
// System.out.println("the leap year is "+isLeapYear);

// Switch case
// Scanner sc=new Scanner(System.in);
// System.out.println("enter the year");
// int year=sc.nextInt();
// switch(year%12){
// case 0:
// System.out.println("monkey");
// break;
// case 1:
// System.out.println("rooster");
// break;
// case 2:
// System.out.println("dog");
// break;
// case 3:
// System.out.println("pig");
// break;
// case 4:
// System.out.println("rat");
// break;
// case 5:
// System.out.println("ox");
// break;
// case 6:
// System.out.println("tiger");
// break;
// case 7:
// System.out.println("rabbit");
// break;
// case 8:
// System.out.println("dragon");
// break;
// case 9:
// System.out.println("snake");
// break;
// case 10:
// System.out.println("horse");
// break;
// case 11:
// System.out.println("sheep");
// break;
// }
//

// gues number
// Scanner sc=new Scanner(System.in);
// Random rand=new Random();
//
// while(true){
//
// System.out.println("gues the number between 0 to 9 ");
// int num=rand.nextInt(10);
// System.out.println("num is"+num);
// System.out.println("enter the answer");
// int answer=sc.nextInt();
// if (answer==-1){
// System.out.println("stop the loop");
// break;
// }
// if(num==answer){
// System.out.println("the number is right");
//
// }else if(num>answer){
// System.out.println("the number is too high");
//
// }else{
// System.out.println("the number is too low");
// }
// }

// sum do wwhile
// Scanner sc=new Scanner(System.in);
// int sum=0;
// int num=0;
// do{
// System.out.println("enter the num ::");
// num=sc.nextInt();
// sum=sum+num;
//
// }while(num!=0);
// System.out.println("the sum is ::"+sum);

// multiply table
// Scanner sc=new Scanner(System.in);
// for(int i=1;i<=10;i++){
// System.out.println("table of ::"+i);
// for(int j=1;j<=10;j++){
// System.out.println(i+"*"+j+"="+(i*j));
//
// }
// System.out.println();
//
// }

// greatrest common divisoner
// Scanner sc=new Scanner(System.in);
// System.out.println("enter the num1");
// int num1=sc.nextInt();
// System.out.println("enter the num2");
// int num2=sc.nextInt();
// int gcd=1;
// int k=2;
// while(k<=num1 && k<=num2){
// if(num1%k==0 && num2%k==0){
// gcd=k;
//
// }k=k+1;
// }
// System.out.println("the greatest common number "+num1+" and "+num2+" is
// "+gcd);

// palindromme
// Scanner sc=new Scanner(System.in);
// System.out.println("enter the number");
// int num=sc.nextInt();
// int orignal=num;
// int reverce=0;
// while(num!=0){
// int digit=num%10;
// reverce=reverce*10+digit;
// num=num/10;
// }
// if(orignal==reverce){
// System.out.println("the num is palindrome");
// }else{
// System.out.println("the num is not palindrome");
// }

// prime number 50
// int count =0;
// int number=2;
// while(count<50){
// boolean isPrime=true;
// for(int i=2;i<number;i++){
// if(number%i==0){
// isPrime=false;
// break;
// }
// }
// if(isPrime){
// System.out.println(number+" ");
// count=count+1;
// }
// number=number+1;
// }
//
// }
// }