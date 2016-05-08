// S круга = pi*r*r
public class Triangle implements Shape {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;
    private double width;
    private double height;
    private double S;

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
        width = maximum(x1, x2, x3) - minimum(x1, x2, x3);
        return width;
    }

    @Override
    public double getHeight() {
        height = maximum(y1, y2, y3) - minimum(y1, y2, y3);
        return height;
    }

    @Override
    public double getArea() {
        S = Math.sqrt(Math.pow(((x3 - x1) * (y2 - y1) - (x2 - x1) * (y3 - y1)), 2)) / 2;
        return S;
    }

    public double maximum(double a, double b, double c) {
        double max;
        if (a > b) {
            max = a;
            if (c > max) {
                max = c;
            }
        } else {
            if (b > c) {
                max = b;
            } else {
                max = c;
            }
        }
        return max;
    }

    public double minimum(double a, double b, double c) {
        double min;
        if (a < b) {
            min = a;
            if (c < min) {
                min = c;
            }
            return min;
        } else {
            if (b < c) {
                min = b;
            } else {
                min = c;
            }
        }
        return min;
    }

}
