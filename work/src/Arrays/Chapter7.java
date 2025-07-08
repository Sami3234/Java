import java.util.Scanner;
public class Chapter7{
public static void main(String[] args) {
// 7.29 (Fibonacci Series(c)) 
Scanner input = new Scanner(System.in);
while(true){
    System.out.print("Enter -1 to Exit!\nEnter a Number till which you want fibonacci Series: ");
    double num = input.nextDouble();
    if(num==-1){
        System.out.println("You choose to Exit!");
        break;}
    if(num<0){
        System.out.println("Enter a Non-Negative Number!");
    }else{
        for(double i=1;i>num; i++){
            System.out.print(FibonacciSeries(i) + " ");}
            System.out.println();}}}
public static double FibonacciSeries(double n){
    if (n<=1){
        return n;}        
    else{
        return FibonacciSeries(n-1)+FibonacciSeries(n-2);
        }
    }
}
        









// 7.10 (Sales Commissions)
// Scanner hashir = new Scanner(System.in);
// int[] salaryRanges = new int[9];
// while (true) {
//     System.out.print("Enter Gross Sales(-1 to Exit!): ");
//     double grossSales = hashir.nextInt();
//     int salary = (int) (200+(0.09*grossSales));
//     if(grossSales == -1) break;
//     else if(salary>=200&& salary<299) salaryRanges[0]++;
//     else if(salary>=300&& salary<399) salaryRanges[1]++;
//     else if(salary>=400&& salary<499) salaryRanges[2]++;
//     else if(salary>=500&& salary<599) salaryRanges[3]++;
//     else if(salary>=600&& salary<699) salaryRanges[4]++;
//     else if(salary>=700&& salary<799) salaryRanges[5]++;
//     else if(salary>=800&& salary<899) salaryRanges[6]++;
//     else if(salary>=900&& salary<999) salaryRanges[7]++;
//     else if(salary>=1000) salaryRanges[8]++;
// }
//     System.out.println("Salary Ranges\tNumber of People");
//     System.out.printf("200-299$\t\t%d\n",salaryRanges[0]);
//     System.out.printf("300-399$\t\t%d\n",salaryRanges[1]);
//     System.out.printf("400-499$\t\t%d\n",salaryRanges[2]);
//     System.out.printf("500-599$\t\t%d\n",salaryRanges[3]);
//     System.out.printf("600-699$\t\t%d\n",salaryRanges[4]);
//     System.out.printf("700-799$\t\t%d\n",salaryRanges[5]);
//     System.out.printf("800-899$\t\t%d\n",salaryRanges[6]);
//     System.out.printf("900-999$\t\t%d\n",salaryRanges[7]);
//     System.out.printf("1000+$\t\t\t%d\n",salaryRanges[8]);}}



// 7.11 
// int[] counts = new int[10];
// int[] bonus = new int[15];
// int[] bestScores = {95, 87, 98, 88, 92}; 
// // a) Set the 10 elements of integer array counts to zero.
// for (int i = 0; i < counts.length; i++) {
//     counts[i] = 0;}
// // b) Add one to each of the 15 elements of integer array bonus.
// for (int i = 0; i < bonus.length; i++) {
//     bonus[i] += 1;}
// // c) Display the five values of integer array bestScores in column format.
// for (int i = 0; i < bestScores.length; i++) {
//     System.out.println(bestScores[i]);}}}


// 7.12 (Duplicate Elimination) 
// Scanner hashir = new Scanner(System.in);
// int[] array = new int[5];
// for(int i=0; i<array.length;i++){
//     System.out.printf("%nEnter Integer No. %d: ",i+1);
//     int number = hashir.nextInt();
//     if(number<10 || number>100){
//         System.out.println("Enter in range 10-100.");
//         i--; continue;}
//     boolean isDuplicate = true;
//     for(int j=0; j<=i;j++){
//         if(array[j]==number){
//             isDuplicate = true; break;}
//         else isDuplicate = false;}
//     if (isDuplicate) {
//         System.out.println("Dulicate Number! Not added to Array.");}
//     else{
//         array[i] = number;
//         System.out.println("Array till now is:");
//         for(int k=0; k<=i; k++){
//             System.out.print(array[k]+" ");}}}
// System.out.println("\nArray is:");
// for(int i=0; i<array.length; i++){
//     System.out.println(array[i]+" ");}}}



// 7.17 (Dice Rolling)
// int[] array = new int[11];
// for(int i=1; i<=36000000; i++){
//     int point = rollice();
//     if(point==2) array[0]++;
//     else if(point==3) array[1]++;
//     else if(point==4) array[2]++;
//     else if(point==5) array[3]++;
//     else if(point==6) array[4]++;
//     else if(point==7) array[5]++;
//     else if(point==8) array[6]++;
//     else if(point==9) array[7]++;
//     else if(point==10) array[8]++;
//     else if(point==11) array[9]++;
//     else if(point==12) array[10]++;}
// System.out.printf("Sum 2 appeared %d times\n",array[0]);
// System.out.printf("Sum 3 appeared %d times\n",array[1]);
// System.out.printf("Sum 4 appeared %d times\n",array[2]);
// System.out.printf("Sum 5 appeared %d times\n",array[3]);
// System.out.printf("Sum 6 appeared %d times\n",array[4]);
// System.out.printf("Sum 7 appeared %d times\n",array[5]);
// System.out.printf("Sum 8 appeared %d times\n",array[6]);
// System.out.printf("Sum 9 appeared %d times\n",array[7]);
// System.out.printf("Sum 10 appeared %d times\n",array[8]);
// System.out.printf("Sum 11 appeared %d times\n",array[9]);
// System.out.printf("Sum 12 appeared %d times\n",array[10]);
// }public static int rollice(){
//         int die1 = 1 + rn.nextInt(6);
//         int die2 = 1 + rn.nextInt(6);
//         int sum = die1+die2;
//         return sum;}}

// 7.27 (Sieve of Eratosthenes)
// Create a boolean array with 1000 elements initialized to true
// boolean[] isPrime = new boolean[1000];
// for (int i = 2; i < isPrime.length; i++) {
//     isPrime[i] = true;} // Initialize elements from index 2 to 999 as true
// // Implement the Sieve of Eratosthenes
// for (int i = 2; i * i < isPrime.length; i++) {
//     if (isPrime[i]) {
//         // Set all multiples of i to false
//         for (int j = i * i; j < isPrime.length; j += i) {
//             isPrime[j] = false;}}}
// // Display prime numbers between 2 and 999
// System.out.println("Prime numbers between 2 and 999:");
// for (int i = 2; i < isPrime.length; i++) {
//     if (isPrime[i]) {
//                 System.out.print(i + " ");}}}}


// (7.19) Air Reservation System
// boolean[] seats = new boolean[10]; // false means empty, true means occupied
// Scanner hashir = new Scanner(System.in);
// boolean keepRunning = true;
// while (keepRunning) {
//     System.out.println("Please type 1 for First Class or 2 for Economy:");
//     int choice = hashir.nextInt();
//     if (choice == 1) {
//         // Assign a seat in the First Class section (1-5)
//         if (!assignSeat(seats, 0, 4)) {
//             System.out.println("First Class is full. Would you like to be placed in Economy? (yes/no)");
//             String response = hashir.next();
//             if (response.equalsIgnoreCase("yes")) {
//                 if (!assignSeat(seats, 5, 9)) {
//                     System.out.println("Economy is also full. Next flight leaves in 3 hours.");
//                     keepRunning = false; }} else {
//                 System.out.println("Next flight leaves in 3 hours.");
//                 keepRunning = false;}} // End the program
//     } else if (choice == 2) {
//         // Assign a seat in the Economy section (6-10)
//         if (!assignSeat(seats, 5, 9)) {
//             System.out.println("Economy is full. Would you like to be placed in First Class? (yes/no)");
//             String response = hashir.next();
//             if (response.equalsIgnoreCase("yes")) {
//                 if (!assignSeat(seats, 0, 4)) {
//                     System.out.println("First Class is also full. Next flight leaves in 3 hours.");
//                     keepRunning = false;} // End the program
//             } else {
//                 System.out.println("Next flight leaves in 3 hours.");
//                 keepRunning = false;}} // End the program
//     } else {
//         System.out.println("Invalid input. Please type 1 for First Class or 2 for Economy.");}}}
// // Method to assign a seat within the given range (start to end)
// public static boolean assignSeat(boolean[] seats, int start, int end) {
// for (int i = start; i <= end; i++) {
//     if (!seats[i]) { // If the seat is empty
//         seats[i] = true; // Mark it as occupied
//         System.out.println("Boarding pass: Seat " + (i + 1) +
//                 ((start == 0) ? " (First Class)" : " (Economy)"));
//         return true;}} // Seat successfully assigned
// return false;}} // No available seats in this section
        



// 7.20 (Total Sales) 
// double[][] sales = new double[5][4]; // 5 products, 4 salespeople
// Scanner hashir = new Scanner(System.in);
// System.out.println("Enter sales data (or -1 to stop):");
// System.out.println("Format: salesperson_number product_number total_sales");
// while (true) {
// System.out.print("Enter salesperson (1-4), product (1-5), and total sales: ");
// int salesperson = hashir.nextInt();
// if (salesperson == -1) break; // Stop input if -1 is entered
// int product = hashir.nextInt();
// double amount = hashir.nextDouble();
// // Update the sales array
// if (salesperson >= 1 && salesperson <= 4 && product >= 1 && product <= 5) {
//     sales[product - 1][salesperson - 1] += amount;
// } else {
//     System.out.println("Invalid input. Please enter salesperson (1-4) and product (1-5).");}}
// // Display the sales summary
// System.out.println("\nSales Summary:");
// System.out.printf("%-18s %-8s %-8s %-9s %-9s %-9s\n",
//  "Product\\Salesperson", "1", "2", "3", "4", "Total");
// double[] salespersonTotals = new double[4]; // Totals for each salesperson
// for (int product = 0; product < 5; product++) {
// double productTotal = 0; // Total for the current product
// System.out.printf("%-18s", "Product " + (product + 1));
// for (int salesperson = 0; salesperson < 4; salesperson++) {
//     System.out.printf("%-10.2f", sales[product][salesperson]);
//     productTotal += sales[product][salesperson];
//     salespersonTotals[salesperson] += sales[product][salesperson];}
// System.out.printf("%-10.2f\n", productTotal);} // Print total for the current product
// // Print totals for each salesperson
// System.out.printf("%-18s", "Total");
// double grandTotal = 0;
// for (double total : salespersonTotals) {
// System.out.printf("%-10.2f", total);
// grandTotal += total;}
// System.out.printf("%-10.2f\n", grandTotal);}} // Print grand total


// 7.29 (Fibonacci Series(b)) 
// Scanner hashir = new Scanner(System.in);
// while(true){
//     System.out.print("Enter -1 to Exit!\nEnter a Number till which you want fibonacci Series: ");
//     int num = hashir.nextInt();
//     if(num==-1){
//         System.out.println("You choose to Exit!");
//         break;}
//     if(num<0){
//         System.out.println("Enter a Non-Negative Number!");
//     }else{
//         for(int i=0;i<num; i++){
//             System.out.print(FibonacciSeries(i) + " ");}
//             System.out.println();}}}
// public static int FibonacciSeries(int n){
//     if (n<=1){
//         return n;}        
//     else{
//         return FibonacciSeries(n-1)+FibonacciSeries(n-2);}}}


// 7.29 (Fibonacci Series(c)) 
// Scanner hashir = new Scanner(System.in);
// while(true){
//     System.out.print("Enter -1 to Exit!\nEnter a Number till which you want fibonacci Series: ");
//     double num = hashir.nextDouble();
//     if(num==-1){
//         System.out.println("You choose to Exit!");
//         break;}
//     if(num<0){
//         System.out.println("Enter a Non-Negative Number!");
//     }else{
//         for(double i=1;i>num; i++){
//             System.out.print(FibonacciSeries(i) + " ");}
//             System.out.println();}}}
// public static double FibonacciSeries(double n){
//     if (n<=1){
//         return n;}        
//     else{
//         return FibonacciSeries(n-1)+FibonacciSeries(n-2);}}}



