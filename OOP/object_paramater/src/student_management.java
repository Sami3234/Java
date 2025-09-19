import java.util.Scanner;

public class student_management
{
   private String name;
   private int marks;
   private int age;
   private String cls;

   student_management(String name, int marks, int age, String cls)
   {
    this.name=name;
    this.marks=marks;
    this.age=age;
    this.cls=cls;
   }

    student_management(String name,int age, String cls)
   {
    this.name=name;
    
    this.age=age;
    this.cls=cls;

   }
public void change_marks(student_management s)
{   Scanner sc= new Scanner(System.in);
    System.out.println("Enter updated marks");
    s.marks=sc.nextInt();
}

public void view_information()
{
    System.out.println(this.name);
    System.out.println(this.marks);
    System.out.println(this.age);
    System.out.println(this.cls);

}


public void view_information(student_management s)
{
    System.out.println(s.name);
    System.out.println(s.marks);
    System.out.println(s.age);
    System.out.println(s.cls);

}




}