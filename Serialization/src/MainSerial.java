import java.io.ObjectOutputStream;

public class MainSerial {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 6);
        System.out.println(rectangle.getArea());

       try ( ObjectOutputStream = new ObjectOutputStream(new ObjectOutputStream("out.bin")));
    }
}
