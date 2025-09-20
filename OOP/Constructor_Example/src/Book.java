public class Book {
    String name;
    String author;
    int year;
    double price;

    Book(){
        name ="Unknown";
        author ="Unknown";
        year = 0;
        price= 10;

    }
    Book(String name, String author, int year, double price){
        this.name = name;
        this.author = author;
        this.year = year;
        this.price = price;
    }
    Book(String name){
        this.name = name;
        this.author = "Sami";
        this.year= 2025;
        this.price = 1000;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Author: "+author);
        System.out.println("Year: "+year);
        System.out.println("Price: "+price);
    }

}
