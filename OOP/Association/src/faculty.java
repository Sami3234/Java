public class faculty {

    private String name;
    private String qualification;
    private course [] courselist;
    faculty(String name, String qualification){
        this.name = name;
        this.qualification = qualification;
    }
    public void set_course_list(course [] courselist){
        this.courselist = courselist;
    }
    public void view_teacher(){
        System.out.println("The name of the teacher is: "+name);
        System.out.println("This name of the qualification is:"+qualification);
        System.out.println("list of courses taught by the teacher:");
        for(course a:courselist){
            System.out.println(a.getcourse_name());

        }
    }
}
