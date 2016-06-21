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
        System.arraycopy(anyVector.components, 0, this.components, 0, components.length);
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

    public double getComponent(int component) {
        return this.components[component];
    }

    public void setComponent(int component, double newComponent) {
        this.components[component] = newComponent;
    }

    public boolean equals(Vector obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (this.components.length != obj.components.length) {
            return false;
        }
        for (int i = 0; i < components.length; i++) {
            if (Math.abs(this.components[i] - obj.components[i]) > 0.0001) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int result = 1;
        result = prime * result + dimention;
        for (int i = 1; i <= components.length; i++) {
            double d = 10000 * components[i - 1];
            int in = (int) d;
            result = prime * result + in * i * prime;
        }
        return result;
    }

    public static Vector summationVectors(Vector v1, Vector v2) {
        double[] minV = v1.components;
        double[] maxV = v2.components;
        if (v1.components.length != v2.components.length) {
            if (v1.components.length < v2.components.length) {
                minV = v1.components;
                maxV = v2.components;
            } else {
                minV = v2.components;
                maxV = v1.components;
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
        Vector sumVector = new Vector(maxV.length);
        sumVector.components = minV;
        return sumVector;
    }

//    public static Vector subsVectors(Vector v1, Vector v2) {
//        double[] maxV = v1.components;
//        double[] minV = v2.components;
//        if (v1.components.length != v2.components.length) {
//            if (v1.components.length < v2.components.length) {
//                minV = v1.components;
//                maxV = v2.components;
//            } else {
//                minV = v2.components;
//                maxV = v1.components;
//            }
//            double[] newV = new double[maxV.length];
//            System.arraycopy(minV, 0, newV, 0, minV.length);
//            for (int i = minV.length; i < newV.length; i++) {
//                newV[i] = 0.0;
//            }
//            minV = newV;
//        }
//        for (int i = 0; i < maxV.length; i++) {
//            minV[i] = minV[i] - maxV[i];
//        }
//        Vector subVector = new Vector(maxV.length);
//        subVector.components = minV;
//        return subVector;
//    }

    public static Vector subsVectors(Vector v1, Vector v2) {
        if (v1.components.length != v2.components.length) {
            double[] newC = new double[Math.max(v1.components.length, v2.components.length)];
            if (v1.components.length < v2.components.length) {
                System.arraycopy(v1.components, 0, newC, 0, v1.components.length);
                for (int i = v1.components.length; i < newC.length; i++) {
                    newC[i] = 0.0;
                }
                v1.components = newC;
            } else {
                System.arraycopy(v2.components, 0, newC, 0, v2.components.length);
                for (int i = v2.components.length; i < newC.length; i++) {
                    newC[i] = 0.0;
                }
                v2.components = newC;
            }
        }
        for (int i = 0; i < v1.components.length; i++) {
            v1.components[i] = v1.components[i] - v2.components[i];
        }
        Vector subVector = new Vector(v1.components.length);
        subVector.components = v1.components;
        return subVector;
    }

    public static Vector scalarMultiplyVectors(Vector v1, double scalar) {
        Vector scalarV = new Vector(v1.components.length);
        System.arraycopy(v1.components, 0, scalarV.components, 0, v1.components.length);
        for (int i = 0; i < v1.components.length; i++) {
            scalarV.components[i] = scalarV.components[i] * scalar;
        }
        return scalarV;
    }
}