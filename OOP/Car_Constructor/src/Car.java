public class Car{
    String brand;
    String Color;

    
    Car(String brand, String Color){
        this.brand = brand;
        this.Color = Color;
    }
    public void drive(){
        System.out.println(brand+ "is on way");
        System.out.println(Color+ "is your car");
    }
}