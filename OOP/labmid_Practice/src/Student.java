public class Student {
    public String name;
    Teacher t;
    Student(String n, Teacher teach){
        name=n;
        t=teach;
    }
    public void displayinfo(){
        System.out.println("Student Name:"+name);
        System.out.println("Teacher Name:"+t.name);
    }
}