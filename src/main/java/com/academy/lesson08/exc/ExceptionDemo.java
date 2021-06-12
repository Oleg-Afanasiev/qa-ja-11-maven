package com.academy.lesson08.exc;

public class ExceptionDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        try {
            System.out.println("step 1");
            double result = calc.div(5, 4);
            System.out.println(result);

            System.out.println("step 2");
            double result2 = calc.div(5, 0);
            System.out.println(result2);

            System.out.println("step 3");
            double result3 = calc.div(5, 2);
            System.out.println(result3);
        } catch (DivisionByZero e) {
            System.out.println("Error. Wrong argument. Division by zero");
        } finally {
            System.out.println("--finish--");
        }

        System.out.println("step 4");
    }
}
