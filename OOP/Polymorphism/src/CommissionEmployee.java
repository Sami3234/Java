public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;
    public CommissionEmployee(String first,String last,String ssn,double sales,double rate){
        super(first,last,ssn);
        grossSales = sales;
        commissionRate = rate;
    }
     public double earnings(){
            return grossSales * commissionRate;

        }
}