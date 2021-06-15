package com.academy.lesson11;

public class HTDemo {
    public static void main(String[] args) {
        double number = 3.0;
        int intValue = (int)number;
        System.out.println(intValue);

        Double number2 = 3.0;
        int intValue2 = number2.intValue();
        System.out.println(intValue2);
    }
}
