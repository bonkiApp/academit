package ru.kibon.vector;

public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector(5);
        System.out.println(vector.toString(vector));

        Vector copyVector = new Vector(vector);
        System.out.println(copyVector.toString(copyVector));

        Vector arrVector = new Vector(1, new double[]{2, 5, 1.5});
        System.out.println(arrVector.toString(arrVector));

    }
}
