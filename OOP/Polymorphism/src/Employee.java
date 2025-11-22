public abstract class Employee{
    private String firstname;
    private String lastname;
    private String socialsecuritynumber;

    public  Employee(String first,String last,String ssn){
        firstname= first;
        lastname =last;
        socialsecuritynumber =ssn;
    }
    public String toString(){
        return String.format("%s %s\nsocial security number: %s"+firstname,lastname,socialsecuritynumber);
    }
    public abstract double earnings();

}