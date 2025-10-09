public class App {
    public static void main(String[] args) throws Exception {
       Date b = new Date(1, 12, 1990);
       Date h = new Date(5, 6, 2016);
       employee e1 =new employee("Sami", "Abid",b, h);
       e1.display();
    }
}
