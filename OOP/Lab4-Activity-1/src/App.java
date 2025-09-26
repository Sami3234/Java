public class App {
    public static void main(String[] args) throws Exception {
        studentRecord s= new studentRecord();
        s.setDegree("MBA");
        employeeRecord e = new employeeRecord();
        e.setEmp_id(1);
        e.setSalary(25000);
        Manager m1 = new Manager("Finance Manager", 5000, e, s);
        m1.display();
    }
}
