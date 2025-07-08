import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.SecurityException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Lab13 {
    public static void main(String[] args) {

        // Attempt to open a file named "clients.txt" for writing
        try (Formatter output = new Formatter("BCS.txt")) {
           // Create a Scanner object to read user input
            Scanner input = new Scanner(System.in);
            showDirectory(input);
            // Prompt the user for input
            System.out.printf("%s%n%s%n", "Enter your student ID,Enter Your name, Father name, Your age and Your GPA.","Enter the end-of-file indicator (e.g., Ctrl+D or Ctrl+Z) to stop input.");
            while (input.hasNext()) {// Loop until the end-of-file indicator is entered
                try {// Write user input to the file; expects valid input format 
                    output.format("%d %s %s %s %s %d %.2f%n",
                    input.nextInt(),
                    input.next(),
                    input.nextLine(),
                    input.next(),
                    input.nextLine(),
                    input.nextInt(),
                    input.nextDouble()
                    );
                   // Account number // First name  // Last name  // Balance)
                } catch (NoSuchElementException elementException) {
                    // Handle invalid input
                    System.err.println("Invalid input. Please try again.");
                    input.nextLine(); }}} // Discard invalid input
        // Catch potential exceptions related to file operations
        catch (SecurityException | FormatterClosedException | IOException  e) {
            e.printStackTrace();}
    }public static void showDirectory(Scanner input) throws IOException{
            System.out.print("Enter the name of a file or directory: ");
        Path path = Paths.get(input.nextLine()); // Create a Path object based on user input
        // Check if the specified path exists
        if (Files.exists(path)) {
            // Display basic information about the file or directory
            System.out.printf("The path '%s' exists.%n", path.getFileName());
            System.out.printf("It is %s directory.%n", Files.isDirectory(path) ? "a" : "not a");
            System.out.printf("It is %s absolute path.%n", path.isAbsolute() ? "an" : "not an");    
            // Output additional details
            System.out.printf("Last modified time: %s%n", Files.getLastModifiedTime(path));
            System.out.printf("Size: %d bytes%n", Files.size(path));
            System.out.printf("Path: %s%n", path);
            System.out.printf("Absolute Path: %s%n", path.toAbsolutePath());
            // If the path represents a directory, list its contents
            if (Files.isDirectory(path)) {
                System.out.println("\nContents of the directory:");
                // Use a DirectoryStream to iterate through the directory's contents
                try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)) {
                    for (Path entry : directoryStream) {
                        System.out.println(entry);}}}
        } else {
            // Inform the user if the path does not exist
            System.out.printf("The path '%s' does not exist.%n", path);}
    }
}