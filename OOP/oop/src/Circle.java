public class Circle {
    public double radius;

    public void setRadius(double r) {
        radius = r;
    }

    public void getArea() {
        double area = radius * radius * 3.145;
        System.out.println("Aera is " + area);
    }
}
