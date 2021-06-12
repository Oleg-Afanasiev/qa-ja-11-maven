package com.academy.lesson09.interfaces;

public class HandlerInt implements Handler<Integer> {
    @Override
    public void handle(Integer value) {
        System.out.println("Handle integer value: " + value);
    }
}
