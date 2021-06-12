package com.academy.lesson09.interfaces;

public class GenericInterfaceDemo {
    public static void main(String[] args) {
        Handler<String> handler1 = new HandlerImpl<>();
        handler1.handle("Hello");

        Handler<Integer> handler2 = new HandlerInt();
        handler2.handle(123);
    }
}
