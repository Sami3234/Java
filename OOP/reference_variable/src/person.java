public class person
{
    String name;     
    int age;         // primitive → default 0
    double salary;   // primitive → default 0.0
    boolean married; // primitive → default false
    person(String n, int a, double s, boolean m) {
        name = n;
        age = a;
        salary = s;
        married = m;
    }
    public void viev_information()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
        System.out.println(married);
    }

}