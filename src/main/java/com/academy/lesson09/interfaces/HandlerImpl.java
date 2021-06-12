package com.academy.lesson09.interfaces;

public class HandlerImpl<T> implements Handler<T> {
    @Override
    public void handle(T value) {
        System.out.println("Handle some type: " + value);
    }
}
