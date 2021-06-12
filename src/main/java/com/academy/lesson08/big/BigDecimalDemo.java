package com.academy.lesson08.big;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        double d1 = 2.0;
        double d2 = 1.1;
        System.out.println(d1 - d2);

        BigDecimal b1 = new BigDecimal("2.0");
        BigDecimal b2 = new BigDecimal("1.1");
        BigDecimal result = b1.subtract(b2);
        System.out.println(result);

        System.out.println(1.0/3);

        BigDecimal one = new BigDecimal("1.0");
        BigDecimal three = new BigDecimal("3.0");
        System.out.println(one.divide(three, 10, RoundingMode.HALF_UP));

        BigDecimal b3 = new BigDecimal("1.0");
        BigDecimal b4 = new BigDecimal("1.00");

        System.out.println(b3 == b4); // false
        System.out.println(b3.equals(b4)); // true?
        System.out.println(b3.compareTo(b4) == 0); // true - правильный способ сравнения
    }
}
