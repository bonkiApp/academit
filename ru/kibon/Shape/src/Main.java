

public class Main {
    public static void main(String[] args) {
        Square sq = new Square(4);
        Triangle tri = new Triangle(3, 2, 3, 7.2, 5, 4.5);
        Rectangle rec = new Rectangle(6, 4);
        Circle cir = new Circle(8.5);

        System.out.println(sq.getArea());
        System.out.println(tri.getArea());
        System.out.println(tri.getWidth());
        System.out.println(tri.getHeight());
        System.out.println(rec.getArea());
        System.out.println(cir.getArea());
    }
}
