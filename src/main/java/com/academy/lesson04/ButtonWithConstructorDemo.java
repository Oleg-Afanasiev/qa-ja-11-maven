package com.academy.lesson04;

public class ButtonWithConstructorDemo {
    public static void main(String[] args) {
        Button button = new Button();
        System.out.println(button.getWidth());

        Button button2 = new Button("Save");
        System.out.println(button2.getText());

        System.out.println(Button.DEFAULT_WIDTH);
    }
}
