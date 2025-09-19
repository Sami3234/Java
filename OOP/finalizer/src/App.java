public class App {
    public static void main(String[] args) throws Exception {
        person p1 = new person("Alice");
        p1 = new person("ali");
       
        System.gc();
        Thread.sleep(1000); // wait for GC to maybe happen
        

    }
}
