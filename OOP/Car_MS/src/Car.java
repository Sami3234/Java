public class Car extends vehicle {
    private String model;
    private Engine engine;

    Car(String brand, int year,String model, Engine engine){
        super(brand, year);
        this.model = model;
        this.engine = engine;
    }
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Model: "+model);

    }
    public void startCar() {
        engine.start();

    }
}
