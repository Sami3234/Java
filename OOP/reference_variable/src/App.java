public class App {
    public static void main(String[] args) throws Exception {
        person p= new person("ali", 20, 20000, false);
        person q=p;
        q.age=22;
        p.viev_information();
    }
}
