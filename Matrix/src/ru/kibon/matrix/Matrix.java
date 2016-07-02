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
        this.rows = other.rows;
        System.arraycopy(other.rows, 0, this.rows, 0, other.rows.length);
    }

    public Matrix(double[][] array) {
        for (int i = 0; i < array.length; i++){
            rows[i] = new Vector(array[i].length, array[i]);
        }
    }

}
