public class App {
    public static void main(String[] args) throws Exception {
       Point p1 = new Point();
       p1.movePoint(2,3);

       p1.display();
       Point p2 = new Point (5,6);
       p2.movePoint(2,4);
       p2.display();
    }
}
