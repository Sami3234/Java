public class App {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car();
        car1.brand ="Toyota";
        car1.year = 2005;
        car1.color ="Black";

        Car car2 = new Car();
        car2.brand ="Firarri";
        car2.year =2000;
        car2.color ="Red";


        car2.drive();
    }
}

