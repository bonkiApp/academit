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
//        this.rows = new Vector[other.rows.length];
        for (int i = 0; i < other.rows.length; i++) {
            this.rows[i].setComponents(other.rows[i].getComponents());
            System.arraycopy(other.rows[i].getComponents(), 0, this.rows[i].setComponents(other.rows[i].getComponents()), 0, other.rows[i].getComponents().length);
        }
    }

    public Matrix(double[][] array) {
        Vector[] rows = new Vector[array.length];
        for (int i = 0; i < array.length; i++) {
            rows[i] = new Vector(array[i].length, array[i]);
        }
    }

}
