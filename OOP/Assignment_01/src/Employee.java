public class Employee {
 private int empId;
 private String name;
 private double salary;
 private static String companyName = "TechNova Solutions";

 public Employee(int empId, String name, double salary) {
  this.empId = empId;
  this.name = name;
  this.salary = salary;
 }

 public void setSalary(double salary) {
  this.salary = salary;
 }

 public double getSalary() {
  return salary;
 }

 public void displayInfo() {
  System.out.println("ID: " + empId);
  System.out.println("Name: " + name);
  System.out.println("Salary: " + salary);
  System.out.println("Company: " + companyName);
  System.out.println();
 }

 public static String getCompanyName() {
  return companyName;
 }
}
