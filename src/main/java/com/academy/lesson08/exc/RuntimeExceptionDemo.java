package com.academy.lesson08.exc;

public class RuntimeExceptionDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int result1 = calc.sumPositiveNumbers(1, 2);
        System.out.println(result1);

//        try {
            int result2 = calc.sumPositiveNumbers(2, -2);
            System.out.println(result2);
//        } catch (Exception e) {
//            System.out.println("Перехватили");
//        }

        System.out.println("Продолжаем расчеты");
    }
}
