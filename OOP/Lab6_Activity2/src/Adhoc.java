public class Adhoc extends Employee {
    private int numberofWorkingDays;
    private int wage;

    public Adhoc (String name,String phone,String address, int allowance, int numberofWorkingDays,int wage){
        super(name,phone,address,allowance);
        this.numberofWorkingDays =numberofWorkingDays;
        this.wage = wage;
    }
    public void Display(){
        System.out.println("Name: "+name+" Phone Number: "+phone+" Address: "+address+ " Allowance: "+allowance+ " Number of Working Days:"+numberofWorkingDays+" Wage: "+wage);
        
    }
}

