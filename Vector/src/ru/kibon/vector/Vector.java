package ru.kibon.vector;

public class Vector {
    double n;

    public Vector(double n) {
        this.n = n;
    }

    public Vector(Vector vector) {
        new Vector(this);
    }

//    public Vector(double n, double[]) {
//
//    }


    public double getSize1() {
        return 1;
    }

}
