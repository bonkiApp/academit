import java.io.IOException;
import java.io.ObjectInputStream;

public class Rectangle {
    private double width;
    private double height;
    private transient double area;

    public Rectangle(double x, double y) {
        this.width = x;
        this.height = y;
        this.area = x * y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return area;
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
        in.defaultReadObject();
        area = width * height;
    }
}
