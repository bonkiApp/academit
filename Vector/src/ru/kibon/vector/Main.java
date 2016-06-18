package ru.kibon.vector;

public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector(5);
        System.out.println(vector.toString(vector));

        Vector arrVector = new Vector(4, new double[]{2, 5, 1.5, -2});
        System.out.println(arrVector.toString(arrVector));

        Vector copyArrVector = new Vector(arrVector);
        System.out.println(arrVector.toString(arrVector));

        System.out.println(copyArrVector.getSize());

        Vector vector2 = new Vector(5, new double[] {3, 2, 14.2, 1, -1});

        arrVector.sumVectors(vector2);
        System.out.println(arrVector.toString(arrVector));

//        arrVector.subtractVectors(vector2);
//        System.out.println(arrVector.toString(arrVector));
    }
}
