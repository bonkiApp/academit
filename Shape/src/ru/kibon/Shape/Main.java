package ru.kibon.Shape;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(4);
        Triangle triangle = new Triangle(3, 2, 3, 7.2, 5, 4.5);
        Rectangle rectangle = new Rectangle(6, 4);
        Circle circle = new Circle(8.5);

        System.out.println(square.getArea());
        System.out.println(triangle.getArea());
        System.out.println(triangle.getWidth());
        System.out.println(triangle.getHeight());
        System.out.println(rectangle.getArea());
        System.out.println(circle.getArea());
    }
}
