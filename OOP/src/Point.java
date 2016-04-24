public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double foundDistanse(Point point2) {
        double d = Math.sqrt(Math.pow((this.x-point2.x),2)+Math.pow((this.y-point2.y),2));
        return d;
    }

}
