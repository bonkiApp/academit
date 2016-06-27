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
        this.components = new double[dimension];
        System.arraycopy(components, 0, this.components, 0, Math.min(dimension, components.length));
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        StringBuilder builder = new StringBuilder();
        builder.append("{ ");
        for (double el : this.components) {
            builder.append(df.format(el));
            builder.append(", ");
        }
        builder.delete(builder.length() - 2, builder.length());
        builder.append(" }");
        return builder.toString();
    }

    public double calcLength() {
        double sum = 0;
        for (double d : this.components) {
            sum += d * d;
        }
        return Math.sqrt(sum);
    }

    public Vector sumVectors(Vector vector2) {
        if (this.components.length < vector2.components.length) {
            double[] newV = new double[vector2.components.length];
            System.arraycopy(this.components, 0, newV, 0, this.components.length);
            this.components = newV;
        }
        for (int i = 0; i < vector2.components.length; i++) {
            this.components[i] = this.components[i] + vector2.components[i];
        }
        return this;
    }

    public Vector subtractVectors(Vector vector2) {
        if (this.components.length < vector2.components.length) {
            double[] newV = new double[vector2.components.length];
            System.arraycopy(this.components, 0, newV, 0, this.components.length);
            this.components = newV;
        }
        for (int i = 0; i < vector2.components.length; i++) {
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Vector other = (Vector) obj;
        if (this.components.length != other.components.length) {
            return false;
        }
        for (int i = 0; i < components.length; i++) {
            if (Math.abs(this.components[i] - other.components[i]) >= 0.0001) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int result = 1;
        result = prime * result + Arrays.hashCode(components);
        return result;
    }

    public static Vector sumVectors(Vector v1, Vector v2) {
        Vector newV1 = new Vector(v1);
        return newV1.sumVectors(v2);
    }

    public static Vector subtractVectors(Vector v1, Vector v2) {
        Vector newV1 = new Vector(v1);
        return newV1.subtractVectors(v2);
    }

    public static double multiplyVectors(Vector v1, Vector v2) {
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
        double result = 0;
        for (int i = 0; i < newV1.components.length; i++) {
            result += newV1.components[i] * newV2.components[i];
        }
        return result;
    }
}