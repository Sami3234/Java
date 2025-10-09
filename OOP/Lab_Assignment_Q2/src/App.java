public class App {
    public static void main(String[] args) {
        Point p1 = new Point(5, 8);
        Point p2 = new Point(10, 13);
        Line l1 = new Line(p1, p2);

        Point p3 = new Point(1, 5);
        Point p4 = new Point(5, 12);
        Line l2 = new Line(p3, p4);

        System.out.println("Length of line 1: " + l1.findLength());
        System.out.println("Length of line 2: " + l2.findLength());
    }
}
