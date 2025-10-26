public class App {
    public static void main(String[] args) throws Exception {
      Teacher t1 =new Teacher("Sami");
      Student s1 = new Student("Khan",t1);
      s1.displayinfo();
}
}
