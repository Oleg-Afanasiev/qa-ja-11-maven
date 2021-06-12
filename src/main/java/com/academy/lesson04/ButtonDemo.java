package com.academy.lesson04;

public class ButtonDemo {
    public static void main(String[] args) {
        int n = 1;
        Button btn1 = new Button();
        btn1.height = 10;
        // btn1.width = 10;
        btn1.setWidth(10);

        Button btn2 = new Button();
        btn2.setWidth(-20);
        System.out.println(btn1.getWidth());
        System.out.println(btn2.getWidth());

        System.out.println("----init----");
        Button btn3 = new Button();
        btn3.init("Login");
        System.out.println(btn3.getWidth());

        Button btn4 = new Button();
        btn4.init("Logout", 20);
        System.out.println(btn4.getWidth());
    }
}
