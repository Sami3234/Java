// File: FileDirectoryInfo.java
// This program demonstrates how to retrieve and display information about files and directories.
// import java.io.IOException;
// import java.nio.file.DirectoryStream;
// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.nio.file.Paths;
// import java.util.Scanner;
// public class FileDirectoryInfo {
//     public static void main(String[] args) throws IOException {
//         // Create a Scanner object to read user input
//         Scanner input = new Scanner(System.in);
//         // Prompt the user to enter the name of a file or directory
//         System.out.print("Enter the name of a file or directory: ");
//         Path path = Paths.get(input.nextLine()); // Create a Path object based on user input
//         // Check if the specified path exists
//         if (Files.exists(path)) {
//             // Display basic information about the file or directory
//             System.out.printf("The path '%s' exists.%n", path.getFileName());
//             System.out.printf("It is %s directory.%n", Files.isDirectory(path) ? "a" : "not a");
//             System.out.printf("It is %s absolute path.%n", path.isAbsolute() ? "an" : "not an");    
//             // Output additional details
//             System.out.printf("Last modified time: %s%n", Files.getLastModifiedTime(path));
//             System.out.printf("Size: %d bytes%n", Files.size(path));
//             System.out.printf("Path: %s%n", path);
//             System.out.printf("Absolute Path: %s%n", path.toAbsolutePath());
//             // If the path represents a directory, list its contents
//             if (Files.isDirectory(path)) {
//                 System.out.println("\nContents of the directory:");
//                 // Use a DirectoryStream to iterate through the directory's contents
//                 try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)) {
//                     for (Path entry : directoryStream) {
//                         System.out.println(entry);

//                 }}
//         } else {
//             // Inform the user if the path does not exist
//             System.out.printf("The path '%s' does not exist.%n", path);}}}}





// // File: FileDirectoryInfo.java
// // This program demonstrates how to retrieve and display information about files and directories.
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileDirectoryInfo {
    public static void main(String[] args) throws IOException {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the name of a file or directory
        System.out.print("Enter the name of a file or directory: ");
        Path path = Paths.get(input.nextLine()); // Create a Path object based on user input

        // Check if the specified path exists
        if (Files.exists(path)) {
            // Display basic information about the file or directory
            System.out.printf("The path '%s' exists.%n", path.getFileName());
            System.out.printf("It is %s directory.%n", Files.isDirectory(path) ? "a" : "not a");
            System.out.printf("It is %s absolute path.%n", path.isAbsolute() ? "an" : "not an");
            System.out.printf("Last modified time: %s%n", Files.getLastModifiedTime(path));
            System.out.printf("Size: %d bytes%n", Files.size(path));
            System.out.printf("Path: %s%n", path);
            System.out.printf("Absolute Path: %s%n", path.toAbsolutePath());

            // If the path represents a directory, list its contents
            if (Files.isDirectory(path)) {
                System.out.println("\nContents of the directory:");
                listDirectory(path);
            }
        } else {
            // Inform the user if the path does not exist
            System.out.printf("The path '%s' does not exist.%n", path);
        }
    }

    // Method to list directory contents, including nested directories
    public static void listDirectory(Path dirPath) throws IOException {
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(dirPath)) {
            for (Path entry : directoryStream) {
                // Print the current entry
                System.out.println(entry);

                // If the entry is a directory, list its contents
                if (Files.isDirectory(entry)) {
                    System.out.printf("\nContents of '%s':%n", entry);
                    listDirectory(entry); // Recursive call
                }
            }System.out.println();
        } catch (IOException e) {
            System.out.printf("Error reading directory: %s%n", dirPath);
        }
    }
}
