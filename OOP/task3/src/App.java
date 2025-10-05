public class App {
    public static void main(String[] args) throws Exception {
        Student[] students ={
            new Student("Sami", 99),
            new Student("Aftab", 75),
            new Student("fiaz", 85),
            new Student("Hasnain",60)
        };
        int total = 0;
        for (Student s: students){
            total+= s.marks;
        }
        double average = (double)total/students.length;
        System.out.println("Average Marks = "+average);
    }
}
