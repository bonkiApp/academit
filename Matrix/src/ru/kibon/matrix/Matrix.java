package ru.kibon.matrix;

import ru.kibon.vector.Vector;

public class Matrix {
    private Vector[] rows;

    public Matrix(int n, int m) {
        Vector[] rows = new Vector[n];
        for (int i = 0; i < n; i++) {
            rows[i] = new Vector(m);
        }
    }

    public Matrix(Matrix other) {
        this.rows = new Vector[other.rows.length];
        for (int i = 0; i < other.rows.length; i++) {
            this.rows[i].components = other.rows[i].components;
            System.arraycopy(other.rows[i].components, 0, this.rows[i].components, 0, other.rows[i].components.length);
        }
    }

    public Matrix(double[][] array) {
        Vector[] rows = new Vector[array.length];
        for (int i = 0; i < array.length; i++) {
            rows[i] = new Vector(array[i].length);
            System.arraycopy(array[i], 0, rows[i].components, 0, array[i].length);
        }
    }
//
//    @Override
//    public String toString(){
//        StringBuilder builder = new StringBuilder();
//
//        for (int i = 0; i < rows.length; i++) {
//            for (int j = 0; j < rows[i].components.length; j++) {
//                builder.append(rows[i].components[j]);
//                builder.append(", ");
//            }
//        }
//        return builder.toString();
//    }
}
