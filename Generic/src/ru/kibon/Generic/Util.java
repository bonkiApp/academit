package ru.kibon.Generic;

public class Util {
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {

        if (p1.getFirst().hashCode() != p2.getFirst().hashCode() || p1.getSecond().hashCode() != p2.getSecond().hashCode()) {
            return false;
        } else {
            return p1.getFirst().equals(p2.getFirst()) && p1.getSecond().equals(p2.getSecond());
        }
    }
}
