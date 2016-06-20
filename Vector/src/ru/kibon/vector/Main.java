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

        Vector vector2 = new Vector(5, new double[] {3, 2, 14.2, 1,-3 });

        arrVector = arrVector.sumVectors(vector2);
        System.out.println(arrVector.toString(arrVector));

        arrVector = arrVector.subtractVectors(vector2);
        System.out.println(arrVector.toString(arrVector));

        vector2 = vector2.multipleVectors(3);
        System.out.println(vector2.toString(vector2));

        vector2 = vector2.reversVector();
        System.out.println(vector2.toString(vector2));

        System.out.println(vector2.calcLength());

        System.out.println(vector2.getComponent(3));

        vector2.setComponent(3, 4);
        System.out.println(vector2.toString(vector2));

    }
}
