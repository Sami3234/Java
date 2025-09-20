public class App {
    public static void main(String[] args) throws Exception {
        Book b1 = new Book();
        Book b2 = new Book("Muhabbat ki Dunia","Sami Khan",2024,5000);
        Book b3 = new Book ("Java OOP");
        b1.display();
        System.out.println("--------------");
        b2.display();
        System.out.println("--------------");
        b3.display();
        
    }
}
