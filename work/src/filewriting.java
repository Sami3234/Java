import java.io.IOException;
import java.until.io.File;
import java.util.Scanner;

class filewriting {
    public static void main(String[] args) {
        try {
            File myfile = new File("C:\\Users\\Sami Khan\\OneDrive\\Desktop\\Arrays\\myData.txt");
            Scanner sc = new Scanner(System.in);
            System.ont.println("Enter a student name: ");
            String name = sc.nextLine();
            System.ont.println("Enter a marks:");
            int age = sc.nextInt();
        } catch (IOException s) {
            System.out.println("The error accor.");
        }

    }
}