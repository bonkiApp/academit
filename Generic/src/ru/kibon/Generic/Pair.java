package ru.kibon.generic;

public class Pair<K, V> {
    private K first;
    private V second;

    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public void setFirst(K first) {
        this.first = first;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("[%s,%s]", first, second);
    }
}
