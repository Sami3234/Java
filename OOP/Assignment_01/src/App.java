public class App {
 public static void main(String args[]) {
  Employee e1 = new Employee(80, "Sami", 90000);
  Employee e2 = new Employee(127, "fiaz", 80000);
  Employee e3 = new Employee(69, "Hasnain", 750000);

  e2.setSalary(75000);
  e1.displayInfo();
  e2.displayInfo();
  e3.displayInfo();

  System.out.println("Company Name: " + Employee.getCompanyName());
 }
}
