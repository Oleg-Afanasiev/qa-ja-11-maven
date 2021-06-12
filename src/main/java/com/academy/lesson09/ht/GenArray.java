package com.academy.lesson09.ht;

public class GenArray<T> {
    private T[] array; // null

    public GenArray(T[] array) {
        this.array = array;
    }

    public T get(int index){
        return array[index];
    }

    public void set(int index, T value) {
        array[index] = value;
    }
}
