
public class Square implements Shape{
    double width;

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return width;
    }

    @Override
    public double getArea() {
        return (width*width);
    }
}
