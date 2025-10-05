public class Book {
   public String title;
    public String author;
     Book(String title, String author){
        this.title = title;
        this.author= author;
     }
     public void display(){
        System.out.println("Title:"+title+ " Author: "+author);
     }
}