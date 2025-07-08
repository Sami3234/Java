// // File: CreateTextFile.java
// // This program writes data to a sequential text file using the Formatter class.
// import java.io.FileNotFoundException;
// import java.lang.SecurityException;
// import java.util.Formatter;
// import java.util.FormatterClosedException;
// import java.util.NoSuchElementException;
// import java.util.Scanner;
// public class CreateTextFile {
//     public static void main(String[] args) {
//         // Attempt to open a file named "clients.txt" for writing
//         try (Formatter output = new Formatter("BCS.txt")) {
//            // Create a Scanner object to read user input
//             Scanner input = new Scanner(System.in);
//             // Prompt the user for input
//             System.out.printf("%s%n%s%n", "Enter account number, first name, last name, and balance.","Enter the end-of-file indicator (e.g., Ctrl+D or Ctrl+Z) to stop input.");
//             while (input.hasNext()) { // Loop until the end-of-file indicator is entered
//                 try {// Write user input to the file; expects valid input format 
//                     output.format("%d %s %s %.2f%n",input.nextInt(),input.next(),input.next(),input.nextDouble());
//                    // Account number // First name  // Last name  // Balance)
//                 } catch (NoSuchElementException elementException) {
//                     // Handle invalid input
//                     System.err.println("Invalid input. Please try again.");
//                     input.nextLine(); }}} // Discard invalid input
//         // Catch potential exceptions related to file operations
//         catch (SecurityException | FileNotFoundException | FormatterClosedException e) {
//             e.printStackTrace();}}}





// import java.io.FileNotFoundException;
// import java.lang.SecurityException;
// import java.util.Formatter;
// import java.util.FormatterClosedException;
// import java.util.NoSuchElementException;
// import java.util.Scanner;
// public class CreateTextFile {
// public static void main(String[] args) {
//     // Attempt to open a file named "clients.txt" for writing
//     try (Formatter output = new Formatter("Ali.txt")) {
//         // Create a Scanner object to read user input
//         Scanner input = new Scanner(System.in);
//         // Prompt the user for input
//         // Loop until the end-of-file indicator is entered
//     while (true) {
//         System.out.println("Enter account number, first name, last name, and balance (or type 'EXIT' to finish):");
//         String data = input.nextLine();
//         if (data.equalsIgnoreCase("EXIT")) {
//             break;} // Stop loop if 'EXIT' is entered
//         try {
//             Scanner lineScanner = new Scanner(data);
//             output.format("%d %s %s %.2f%n",
//                 lineScanner.nextInt(),
//                 lineScanner.next(),
//                 lineScanner.next(),
//                 lineScanner.nextDouble());  
//         } catch (NoSuchElementException e) {
//             System.err.println("Invalid input. Please try again.");}}} 
//     // Catch potential exceptions related to file operations
//     catch (SecurityException | FileNotFoundException | FormatterClosedException e) {
//         e.printStackTrace();}}}



import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {
    public static void main(String[] args) {
        // Use try-with-resources to ensure resources are closed properly
        try (FileWriter fw = new FileWriter("clients.txt", true); // Open in append mode
             PrintWriter output = new PrintWriter(fw);
             Scanner input = new Scanner(System.in)) {

            // Prompt the user for input
            while (true) {
                System.out.println("Enter account number, first name, last name, and balance (or type 'EXIT' to finish):");
                String data = input.nextLine();

                if (data.equalsIgnoreCase("EXIT")) {
                    break; // Stop loop if 'EXIT' is entered
                }

                try {
                    // Use a single Scanner to parse the input
                    Scanner lineScanner = new Scanner(data);
                    output.printf("%d %s %s %.2f%n",
                    lineScanner.nextInt(),
                    lineScanner.next(),
                    lineScanner.next(),
                    lineScanner.nextDouble());  
                    // Write the formatted data to the file

                } catch (NoSuchElementException e) {
                    System.err.println("Invalid input. Please try again.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
