package ru.kibon.vector;

import java.util.Arrays;

public class Vector implements Cloneable {
    private double[] components;
    private int dimention;

    public Vector(int dimention) {
        if (dimention <= 0) {
            throw new IllegalArgumentException("Размерность не может быть <= 0");
        }
        this.components = new double[dimention];
        Arrays.fill(this.components, 0.0);
    }

    public Vector(Vector anyVector) {
        this.components = new double[anyVector.components.length];
    }

    public Vector(int dimention, double[] components) {
        if (dimention <= 0) {
            throw new IllegalArgumentException("Размерность не может быть <= 0");
        }
        if (dimention < components.length) {
            throw new ArrayIndexOutOfBoundsException("Количество элементов переданного массива больше, чем его размерность.");
        } else {
            this.components = new double[dimention];
            System.arraycopy(components, 0, this.components, 0, components.length);
            if (components.length < dimention) {
                for (int i = components.length; i < dimention; i++) {
                    this.components[i] = 0.0;
                }
            }
        }
    }


//        for (int i=0; i < components.length; i++){
//            this.components[i] = components[i];
//        }

    public int getDimention() {
        return dimention;
    }

    public void setDimention(int dimention) {

        this.dimention = dimention;
    }

    public String toString(Vector vector) {
        String vect = "";
        for (double el : vector.components) {
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