public class App {
    public static void main(String[] args) throws Exception {
        Book [] books = new Book[3];
        books[0] =new Book("Java Basics", "James Gosling");
        books[1] = new Book("Clean Code","Rebert C.Martin");
        books[2] = new Book("Effective java","joshua Bloch");

        for(Book b:books)
            b.display();
        
    }
}
