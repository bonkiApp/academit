package ru.kibon.Generic;

public class Main {
    public static void main(String[] args) {
        Pair<String, Double> pair1 = new Pair<>("14", 57.1 - 1);
        Pair<String, Double> pair2 = new Pair<>("14", 56.1000001);

        System.out.println(pair1.toString());

        boolean result = Util.compare(pair1, pair2);
        System.out.println(result);
    }
}
