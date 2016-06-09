package ru.kibon.vector;

public class Vector {
    private double[] component;

    public Vector(int dimention) {
        if (dimention <= 0) {
            throw new IllegalArgumentException("Размерность не может быть <= 0");
        }
        this.component = new double[dimention];
    }
//
//    public Vector(Vector vector) {
//
//        this(vector.n);
//    }

//    public Vector(double n, double[]) {
//
//    }


    public double getSize1() {
        return 1;
    }

}
