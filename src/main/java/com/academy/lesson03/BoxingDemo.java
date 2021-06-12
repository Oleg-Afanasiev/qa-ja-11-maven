package com.academy.lesson03;

public class BoxingDemo {
    public static void main(String[] args) {
        int n = 5;
        Integer m = 5;
        System.out.println(n);
        System.out.println(m);
        int k = n + m;
        System.out.println(k);
        String strNumber = "45";
        int intNumber = Integer.parseInt(strNumber);
        int intNumber2 = Integer.valueOf(strNumber);
        System.out.println(intNumber);
        System.out.println(intNumber2);
        System.out.println(Integer.MAX_VALUE);

        int value1 = 128;
        int value2 = 128;

        Integer value3 = 128;
        Integer value4 = 128;

        System.out.println(value1 == value2);
        System.out.println(value3 == value4);

        Integer value5 = null;
        // int value6 = null;

        Character ch = '4';
        System.out.println(Character.isDigit(ch));
        System.out.println(Character.isDigit('b'));
    }
}
