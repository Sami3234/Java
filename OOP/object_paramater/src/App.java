public class App {
    public static void main(String[] args) throws Exception {
        student_management s1= new student_management("ali",50, 20, "bsse");
    student_management t1= new student_management("xyz", 30, "bsse");
        // s1.view_information();
        // t1.change_marks(s1);
        // System.out.println("after updatation");
        //  s1.view_information();

        t1.view_information();
        t1.view_information(s1);

        s1.view_information(t1);


    }
}
