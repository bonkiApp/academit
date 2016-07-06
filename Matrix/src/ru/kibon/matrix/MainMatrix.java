package ru.kibon.matrix;

public class MainMatrix {
    public static void main(String[] args) {
        Matrix neo = new Matrix(2, 3);
        System.out.println(neo);

        double[][] arr = {{1.2, 5, -2}, {4, 2.7, 3}};
        Matrix morpheus = new Matrix(arr);
        System.out.println(morpheus.toString());

        Matrix trinity = new Matrix(morpheus);
        System.out.println(trinity);
    }
}
