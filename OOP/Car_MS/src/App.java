public class App {
    public static void main(String[] args) throws Exception {
        Engine e1 = new Engine(150);
        Engine e2 = new Engine(200);

        Car c1 = new Car("Toyota",2020, "Corolla",e1);
        Car c2 = new Car("Honda",2022, "Civic",e2);

        c1.displayinfo();
        c1.startCar();

        System.out.println();
        c2.displayinfo();
        c2.startCar();

        vehicle.showTotalVehicles();
    }
}
