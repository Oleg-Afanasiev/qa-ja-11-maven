package com.academy.lesson03;

public class StringDemo {
    public static void main(String[] args) {
        String str = "Hello " + "world!";
        System.out.println(str);
        System.out.println(str.toUpperCase());
        System.out.println(str.length());
        System.out.println(str.substring(6)); // world!
        System.out.println(str.substring(0, 5)); // world!
        System.out.println(str.indexOf("world"));

        String str2 = "  Good bye!   ";
        System.out.println(str2.trim());

        String str3 = "Your number is " + 2;
        System.out.println(str3);

        char letter = str.charAt(1);
        System.out.println(letter);
        System.out.println(str.charAt(2));

        // Сравнение
        System.out.println("Сравнение строк");
        String msg1 = "test";
        String msg2 = new String("test");
        System.out.println(msg1);
        System.out.println(msg2);
        System.out.println(msg1 == msg2);
        System.out.println(msg1.equals(msg2)); // Для строк сравнение только через equals

        int n = 5;
        String strNumber = String.valueOf(n);
    }
}
