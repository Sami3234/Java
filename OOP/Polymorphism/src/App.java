public class App {
    public static void main(String[] args) throws Exception {
    SalariedEmployee salariedEmployee = new SalariedEmployee ("John", 
        "Smith", "9929283939", 800.00 ); 
    HourlyEmployee hourlyEmployee= new HourlyEmployee( "Karen", "Price", 
    "222-22-2222", 16.75, 40 ); 
    CommissionEmployee commissionEmployee = new CommissionEmployee( 
        "Sue", "Jones", "0303030303", 10000, .06 ); 
    SalebaseCommissionEmployee basePlusCommissionEmployee = new 
    SalebaseCommissionEmployee("Bob", "Lewis", "0302829022", 5300, .04,300 );  
    Employee[] employees = new Employee[ 4 ]; 
    employees[ 0 ] = salariedEmployee; 
    employees[ 1 ] = hourlyEmployee; 
    employees[ 2 ] = commissionEmployee; 
    employees[ 3 ] = basePlusCommissionEmployee; 
    for (int i=0; i<4 ;i++) 
    { 
    System.out.println(employees[i].earnings());
    }
}
}
