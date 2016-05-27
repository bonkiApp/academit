
public class Triangle implements Shape {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    @Override
    public double getWidth() {
        return (maximum(x1, x2, x3) - minimum(x1, x2, x3));
    }

    @Override
    public double getHeight() {
        return (maximum(y1, y2, y3) - minimum(y1, y2, y3));
    }

    @Override
    public double getArea() {
        return (Math.abs((x3 - x1) * (y2 - y1) - (x2 - x1) * (y3 - y1)) / 2);
    }

    private static double maximum(double a, double b, double c) {
        double max;
        max = Math.max(a, b);
        max = Math.max(max, c);
        return max;
    }

    private static double minimum(double a, double b, double c) {
        double min;
        min = Math.min(Math.min(a, b), c);
        return min;
    }
}
