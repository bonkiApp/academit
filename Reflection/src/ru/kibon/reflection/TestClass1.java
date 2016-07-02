package ru.kibon.reflection;

public class TestClass1 {
    private double x;
    private double y;

    public TestClass1(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double sum(double x, double y) {
        return x + y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }
}
