public class SalebaseCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public SalebaseCommissionEmployee(String first, String last, String ssn, double sales, double rate, double salary) {
        super(first, last, ssn, sales, rate);
        baseSalary = salary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    @Override
    public double earnings() {
        return baseSalary + super.earnings();
    }
}
