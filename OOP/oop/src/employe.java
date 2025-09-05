class employe {
    String name;
    int salary;
    int grade;

    void show_information() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
    }

    void increse_salary(int amount) {
        salary += amount;
    }
}