package ru.kibon.generic;

public class Util {
    public static <K, V> boolean equals(Pair<K, V> p1, Pair<K, V> p2) {
        if (p1 != null && p2 != null) {
            return p1.getFirst() == p2.getFirst() && p1.getSecond() == p2.getSecond();
        } else {
            return false;
        }
    }
}
