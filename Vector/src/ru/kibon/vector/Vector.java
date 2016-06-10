package ru.kibon.vector;

import java.util.Arrays;

public class Vector {
    private double[] component;
    private int dimention;

    public Vector(int dimention) {
        if (dimention <= 0) {
            throw new IllegalArgumentException("Размерность не может быть <= 0");
        }
        this.component = new double[dimention];
        Arrays.fill(this.component, 0.0);
    }

    public Vector(Vector anyVector) {
        this(anyVector.getDimention());
    }

    public int getDimention() {
        return dimention;
    }

    public void setDimention(int dimention) {
        this.dimention = dimention;
    }

    public String toString(Vector vector) {
        String vect = "";
        for (double el : vector.component) {
            vect = vect + ", " + el;
        }
        vect = vect.substring(2, vect.length());
        return "{ " + vect + " }";
    }


//    public Vector(double n, double[]) {
//
//    }


//    public double getSize1() {
//        return 1;
//    }
//
//}
}