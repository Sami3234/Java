class studentRecord {
    private String degree;
    public studentRecord(){
        }
        public void setDegree(String deg){
            degree = deg;
        }
        public String getDegree() {
            return degree;
        }
    }

class employeeRecord {
    private int emp_id;
    private double salary;
    public employeeRecord(){

    }
    public void setEmp_id(int id){
        emp_id = id;
    }
    public int getEmp_id() {
        return emp_id;
    }
    public void setSalary(int sal){
        salary = sal;
    }
    public double getSalary() {
        return salary;
    }
}

class Manager {
    private String title;
    private double dues;
    private employeeRecord emp;
    public studentRecord stu;

    public Manager(String t, double d, employeeRecord e, studentRecord s) {
        title = t;
        dues = d;
        emp = e;
        stu = s;
    }
    public void display() {
        System.out.println("Title is : "+title);
        System.out.println("Dues is : "+dues);
        System.out.println("Employee record is as under : ");
        System.out.println("Employee id is : "+emp.getEmp_id());
        System.out.println("Employee id is : " +emp.getSalary());
        System.out.println("Student Record is as under : ");
        System.out.println("Degree is : "+stu.getDegree());

    }
}
