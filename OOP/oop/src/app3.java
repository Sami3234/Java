
public class app3 {
    public static void main(String[] args) {
        employe emp = new employe();
        emp.name = "Ali";
        emp.salary = 50000;
        emp.grade = 5;

        emp.show_information();

        emp.increse_salary(5000);

        System.out.println("After increment:");
        emp.show_information();
    }
}