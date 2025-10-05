public class App {
    public static void main(String[] args) throws Exception {
        Employee []  employees={
            new Employee("Ali", 50000),
            new Employee("sara" , 75000),
            new Employee("John", 65000),
            new Employee("Mary", 80000),
            new Employee("Ahmed", 60000)

        };
        Employee highest = employees[0];
        for (Employee e : employees){
                if(e.salary > highest.salary){
                    highest = e;
                }
            }
            System.out.println("Hightest Paid: "+highest.name+" with salary "+highest.salary);
        }
        
    }

