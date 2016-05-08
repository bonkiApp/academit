
public class Circle implements Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getWidth() {
        return r;
    }

    @Override
    public double getHeight() {
        return r;
    }

    @Override
    public double getArea() {
        return (Math.PI * r * r);
    }
}
