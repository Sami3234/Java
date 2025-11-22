public class HourlyEmployee extends Employee{
    private double wags;
    private double hours;
    public HourlyEmployee(String first,String last,String ssn,double hourlyWage,double hoursWorked){
        super(first,last,ssn);
        this.wags = hourlyWage;
        this.hours = hoursWorked;
    }
    public double earnings(){
        if(hours <= 40){
            return wags * hours;
        }else{
            return 40 * wags +(hours-40)* wags*1.5;
        
        }
    }
}