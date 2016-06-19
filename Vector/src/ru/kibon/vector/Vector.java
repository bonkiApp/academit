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


    public double multipleVectors() {
        return 0;
    }

    public double reversVector() {
        return 0;
    }

    public double calcLength() {
        return 0;
    }

    public double getComponent() {
        return 0;
    }

    public double setComponent() {
        return 0;
    }

    public boolean equals() {
        return true;
    }

    public static double foldVectors() {
        return 0;
    }

    public static double subsVectors() {
        return 0;
    }

    public static double scalarMultiplyVectors() {
        return 0;
    }

}