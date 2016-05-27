package ru.kibon.Shape;

public class Square implements Shape {
    private double width;

    public Square(double width) {
        this.width = width;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        //noinspection SuspiciousNameCombination
        return width;
    }

    @Override
    public double getArea() {
        return (width * width);
    }
}
