import java.util.Scanner;
public class trycatch {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in); double len=0;
    do{
        try{
        System.out.print("Enter length of rectangle: ");
        len = obj.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double wid = obj.nextDouble();
    if(len<0 || wid<0){
        throw new Exception("Invalid Input!");
    }    
        double area = len*wid;
        System.out.println("Area of Rectangle is "+area);
    }catch(Exception e){
        System.out.print("Invalid Input!\n");
        obj.nextLine();
    }}while(len!=-1);
}
}
