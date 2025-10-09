public class App {
    public static void main(String[] args) throws Exception {
        LibraryCard card = new LibraryCard("LC2025");
        Student student = new Student("Ali",card);
        student.displayinfo();
    }
}
