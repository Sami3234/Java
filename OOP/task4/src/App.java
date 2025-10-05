import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Product [] products = {
            new Product(1, "Laptop",1000),
            new Product (2, "Phone", 700),
            new Product(3, "Tablet", 500),
            new Product(4, "Charger", 50),
            new Product (5, "HeadPhones", 150)
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name to Search:");
        String search = sc.nextLine();

        boolean found = false;
        for(Product p : products){
            if(p.name.equalsIgnoreCase(search)){
                System.out.println("Product Found:" +p.name+"Price:$"+p.price);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Product not found.");
        }
    }
}
