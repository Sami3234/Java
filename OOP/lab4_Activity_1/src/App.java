public class App {
    public static void main(String[] args) throws Exception {
        ObjectPass p = new ObjectPass();
        p.value=5;
        System.out.println("Before Calling : "+p.value);
        ObjectPass.increment(p);
        System.out.println("After calling: "+p.value);
}
}
