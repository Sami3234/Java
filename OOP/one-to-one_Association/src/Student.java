public class Student {
private String name;
private LibraryCard libraryCard;
public Student(String name,LibraryCard libraryCard){
    this.name = name;
    this.libraryCard = libraryCard;
}
public void displayinfo(){
    System.out.println("Student:"+name);
    System.out.println("Library Card Number"+libraryCard.getCardNumber());
    
}
}
