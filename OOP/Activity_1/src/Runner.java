public class Runner {
    public static void main(String[] args) throws Exception {
        Circle c1 = new Circle();
        c1.setRadius(5);
        System.out.println("Circumference of Circle 1 is: " + c1.CalculateCircumference());
        int r = c1.getRadius();
        Circle c2 = new Circle(r);
        c2.setRadius(5);
        System.out.println("Circumference of Circle 2 is : " + c2.CalculateCircumference());

    }
}
