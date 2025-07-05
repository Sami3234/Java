import java.io.IOException;
import java.io.FileWriter;

public class Createfilehandling {
    public static void main(String[] args) {
        try {
            FileWriter myfile = new FileWriter("data.txt");
            myfile.write("File in java might be created");
            myfile.close();
            System.out.println("\nSuccessfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("\nAn error occurred.");
            e.printStackTrace();
        }
    }
}
