package ru.kibon.generic;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("javac", null);
        Pair<String, Integer> pair2 = new Pair<>("java", null);

        boolean result = Util.equals(pair1, pair2);
        System.out.println(result);
    }
}
