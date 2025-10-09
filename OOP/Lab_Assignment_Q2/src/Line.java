public class Line {
    private Point StartPoint;
    private Point EndPoint;

    public Line(Point StartPoint, Point EndPoint) {
        this.StartPoint = StartPoint;
        this.EndPoint = EndPoint;
    }

    public double findLength() {
        double dx = EndPoint.getX() - StartPoint.getX();
        double dy = EndPoint.getY() - StartPoint.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
