public class App {
    public static void main(String[] args) throws Exception {
       Teacher teacher = new Teacher("Ms.Zainab");
       teacher.addSubject(new Subject("Mathematics"));
       teacher.addSubject(new Subject("Physics"));
       teacher.showSubjects();
    }
}
