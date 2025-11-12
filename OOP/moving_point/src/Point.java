public class Point {
    private int x;
    private int y;

    public Point(){
        this.x=1;
        this.y=2;
    }
    public Point(int a, int b){
        this.x=a;
        this.y =b;

    }
    public void setX(int a){
        x = a;

    }
    public void setY(int b){
        y = b;
    }
    public void display(){
        System.out.println("Point Coordinate = "+x+" y coordinate = "+y);

    }
    public void movePoint(int a,int b){
        x = x+a;
        y= y+b;
        System.out.println("x coordinate after moving = "+x+"y Coordinate after moving = "+y);

    }

}