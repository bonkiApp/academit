package ru.kibon.vector;


import java.util.Arrays;

public class Vector {
    private double[] component;

    public Vector(int dimention) {
        if (dimention <= 0) {
            throw new IllegalArgumentException("Размерность не может быть <= 0");
        }
        this.component = new double[dimention];
        Arrays.fill(this.component, 0.0);
    }
//
//    public Vector(Vector vector) {
//
//        this(vector.n);
//    }

//    public Vector(double n, double[]) {
//
//    }


//    public double getSize1() {
//        return 1;
//    }
//
//}

public String toString(Vector vector){
//    return vector.component[i];
    String vect=null;
     for(double t: vector.component) {
         vect = vect + ", " + t;
     }
    return vect;
}
}