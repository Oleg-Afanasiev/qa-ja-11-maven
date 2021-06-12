package com.academy.lesson04;

public class Button {
    public final static int DEFAULT_WIDTH = 10;

    private int width;
    private String text;
    int height; // package-private

    // конструктор
    public Button() {
        this("Default");
        System.out.println("Конструктор");
        width = 15;
    }

    // конструктор
    public Button(String text) {
        System.out.println("Конструктор с параметром");
        this.text = text;
    }

    public void init(String text) {
        this.text = text;
    }

    public void init(String text, int width) {
        this.width = width;
        this.text = text;
    }

    public int getWidth() {
        return width;
    }

    public String getText() {
        return text;
    }

    public void setWidth(int width) {
        if(width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }
}
