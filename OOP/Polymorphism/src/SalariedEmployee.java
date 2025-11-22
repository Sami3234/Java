public class SalariedEmployee extends Employee{
    private double weeklysalary;
     public SalariedEmployee(String first,String last,String ssn,double salary){
        super(first,last,ssn);
        weeklysalary = salary;
     }
     public double earnings(){
        return weeklysalary;

     }
}