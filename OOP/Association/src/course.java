public class course {
    private String course_name;
    private student [] class_list;
    private faculty teacher;

    course(String course_name, faculty teacher){
        this.course_name = course_name;
        this.teacher = teacher;

    }
    public void set_student_list(student [] s){
        class_list=s;

    }
    public String getcourse_name(){
        return course_name;
    }
    public void show_class_students(){
        for(student a:class_list){
            System.out.println(a.get_student_name());
        }
    }
}