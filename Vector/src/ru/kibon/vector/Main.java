package ru.kibon.vector;

public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector(5);
        System.out.println(vector.toString(vector));

        Vector newVector = new Vector(vector);
        System.out.println(newVector.toString(newVector));

    }
}
