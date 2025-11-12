public class vehicle {
    private String brand;
    private int year;
    static int totalVehicles = 0;

    vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
        totalVehicles++;

    }
    public void displayinfo() {
        System.out.println("Brand: " +brand +",Year:"+year);

    }
    public static void showTotalVehicles() {
        System.out.println("Total Vehicles: " + totalVehicles);
    }
    
}
