public class App {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(4, 6);

        System.out.print("First Fraction: ");
        f1.display();

        System.out.print("Second Fraction: ");
        f2.display();

        if (f1.equals(f2)) {
            System.out.println("Fractions are equal");
        } else {
            System.out.println("Fractions are not equal");
        }
    }
}
