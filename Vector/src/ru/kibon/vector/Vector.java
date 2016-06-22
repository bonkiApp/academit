package ru.kibon.vector;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Vector implements Cloneable {
    private double[] components;

    public Vector(int dimension) {
        if (dimension <= 0) {
            throw new IllegalArgumentException("Размерность не может быть <= 0");
        }
        this.components = new double[dimension];
    }

    public Vector(Vector anyVector) {
        this.components = new double[anyVector.components.length];
        System.arraycopy(anyVector.components, 0, this.components, 0, components.length);
    }

    public Vector(int dimension, double[] components) {
        if (dimension <= 0) {
            throw new IllegalArgumentException("Размерность не может быть <= 0");
        }
        if (dimension < components.length) {
            double[] newComponents = new double[dimension];
            for (int i = 0; i < dimension; i++) {
                newComponents[i] = components[i];
                this.components = newComponents;
            }
        } else {
            this.components = new double[dimension];
            System.arraycopy(components, 0, this.components, 0, components.length);
        }
    }

    public StringBuilder toString(Vector vector) {
        DecimalFormat df = new DecimalFormat("#.##");
        StringBuilder builder = new StringBuilder();
        builder.append("{ ");
        for (double el : vector.components) {
            builder.append(df.format(el));
            builder.append(", ");
        }
        builder.delete(builder.length() - 2, builder.length());
        builder.append(" }");
        return builder;
    }

    public double calcLength() {
        double sum = 0;
        for (double d : this.components) {
            sum += d * d;
        }
        return Math.sqrt(sum);
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
            minV = newV;
        }
        for (int i = 0; i < maxV.length; i++) {
            minV[i] = minV[i] + maxV[i];
        }
        this.components = minV;
        return this;
    }

    public Vector subtractVectors(Vector vector2) {
        if (this.components.length != vector2.components.length) {
            double[] newC = new double[Math.max(this.components.length, vector2.components.length)];
            if (this.components.length < vector2.components.length) {
                System.arraycopy(this.components, 0, newC, 0, this.components.length);
                this.components = newC;
            } else {
                System.arraycopy(vector2.components, 0, newC, 0, vector2.components.length);
                vector2.components = newC;
            }
        }
        for (int i = 0; i < this.components.length; i++) {
            this.components[i] = this.components[i] - vector2.components[i];
        }
        return this;

    }

    public Vector multipleVector(double scalar) {
        for (int i = 0; i < this.components.length; i++) {
            this.components[i] = this.components[i] * scalar + 0.0;
        }
        return this;
    }

    public Vector reverseVector() {
        this.multipleVector(-1);
        return this;
    }

    public int getSize() {
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
            if (Math.abs(this.components[i] - obj.components[i]) >= 0.0001) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int result = 1;
        result = prime * result + components.length;
        for (int i = 1; i <= components.length; i++) {
            double d = 10000 * components[i - 1];
            int in = (int) d;
            result = prime * result + in * i * prime;
        }
        return result;
    }

    public static Vector summationVectors(Vector v1, Vector v2) {
        Vector newV1 = new Vector(v1);
        Vector newV2 = new Vector(v2);
        return newV1.sumVectors(newV2);
    }

    public static Vector subsVectors(Vector v1, Vector v2) {
        Vector newV1 = new Vector(v1);
        Vector newV2 = new Vector(v2);
        return newV1.subtractVectors(newV2);
    }

    public static Vector multiplyVectors(Vector v1, Vector v2) {
        Vector newV1 = new Vector(v1);
        Vector newV2 = new Vector(v2);
        if (newV1.components.length != newV2.components.length) {
            double[] newComponent = new double[Math.max(newV1.components.length, newV2.components.length)];
            if (newV1.components.length < newV2.components.length) {
                System.arraycopy(newV1.components, 0, newComponent, 0, newV1.components.length);
                newV1.components = newComponent;
            } else {
                System.arraycopy(newV2.components, 0, newComponent, 0, newV2.components.length);
                newV2.components = newComponent;
            }
        }
        for (int i = 0; i < newV1.components.length; i++) {
            newV1.components[i] *= newV2.components[i];
        }
        return newV1;
    }
}