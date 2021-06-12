package com.academy.lesson09.extend;

public class ContainerExt<T extends Number> {
    private T element;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}
