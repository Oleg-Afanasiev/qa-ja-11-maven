package com.academy.lesson09;

public class PairContainer<V, U> {
    private V first;
    private U second;

    public V getFirst() {
        return first;
    }

    public void setFirst(V first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }
}
