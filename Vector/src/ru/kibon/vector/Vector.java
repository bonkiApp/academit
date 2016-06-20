package ru.kibon.vector;

import java.util.Arrays;
import java.text.DecimalFormat;

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

    public int getDimention() {
        return dimention;
    }

    public void setDimention(int dimention) {
        this.dimention = dimention;
    }

    public String toString(Vector vector) {
        DecimalFormat df = new DecimalFormat("#.##");
        String vect = "";
        for (double el : vector.components) {
            vect = vect + ", " + df.format(el);
        }
        vect = vect.substring(2, vect.length());
        return "{ " + vect + " }";
    }

    public int getSize() {
        return this.components.length;
    }

    public Vector sumVectors(Vector vector2) {
        double[] minV = this.components;
        double[] maxV = vector2.components;
        if (this.components.length != vector2.components.length) {
            if (this.components.length < vector2.components.length) {
                minV = this.components;
                maxV = vector2.components;
            } else {
                minV = vector2.components;
                maxV = this.components;
            }
            double[] newV = new double[maxV.length];
            System.arraycopy(minV, 0, newV, 0, minV.length);
            for (int i = minV.length; i < newV.length; i++) {
                newV[i] = 0.0;
            }
            minV = newV;
        }
        for (int i = 0; i < maxV.length; i++) {
            minV[i] = minV[i] + maxV[i];
        }
        this.components = minV;
        return this;
    }


    public Vector subtractVectors(Vector vector2) {
        double[] minV = this.components;
        double[] maxV = vector2.components;
        if (this.components.length != vector2.components.length) {
            if (this.components.length < vector2.components.length) {
                minV = this.components;
                maxV = vector2.components;
            } else {
                minV = vector2.components;
                maxV = this.components;
            }
            double[] newV = new double[maxV.length];
            System.arraycopy(minV, 0, newV, 0, minV.length);
            for (int i = minV.length; i < newV.length; i++) {
                newV[i] = 0.0;
            }
            minV = newV;
        }
        for (int i = 0; i < maxV.length; i++) {
            minV[i] = minV[i] - maxV[i];
        }
        this.components = minV;
        return this;
    }


    public Vector multipleVectors(double scalar) {
        for (int i = 0; i < this.components.length; i++) {
            this.components[i] = this.components[i] * scalar;
        }
        return this;
    }

    public Vector reversVector() {
        for (int i = 0; i < this.components.length; i++) {
            this.components[i] = this.components[i] * (-1);
        }
        return this;
    }

    public int calcLength() {
        return this.components.length;
    }

//    public Vector getComponent() {
//        return 0;
//    }
//
//    public Vector setComponent() {
//        return 0;
//    }
//
//    public boolean equals() {
//        return true;
//    }
//
//    public static Vector foldVectors() {
//        return 0;
//    }
//
//    public static Vector subsVectors() {
//        return 0;
//    }
//
//    public static Vector scalarMultiplyVectors() {
//        return 0;
//    }

}