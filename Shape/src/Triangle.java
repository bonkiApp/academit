// S круга = pi*r*r
public class Triangle implements Shape {
    double x1;
    double y1;
    double x2;
    double y2;
    double x3;
    double y3;

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
        return 0;
    }

    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    public double maximum(double a, double b, double c) {
        double max;
        double min;
        if (a > b) {
            max = a;
            min = b;
            if (c > max) {
                max = c;
                return max;
                if (min < c) {
                    return min;
                } else {
                    min = c;
                    return min;
                }
            } else {
                return max;
            }
        } else {
            max = b;
            min = a;
            if (max > c) {
                return max;
                if (min < c){
                    return min;
                }else {
                    min = c;
                    return min;
                }
            } else {
                max = c;
                return max;
            }
        }
    }

    public double minimum(double a, double b, double c) {
        double min;
        if (a < b) {
            min = a;
            if (c < min) {
                min = c;
                return min;
            } else {
                return min;
            }
        } else {
            min = b;
            if (min < c) {
                return min;
            } else {
                min = c;
                return min;
            }
        }
    }

}
