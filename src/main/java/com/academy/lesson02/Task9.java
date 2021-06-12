package com.academy.lesson02;

public class Task9 {
    public static void main(String[] args) {
        int size = 15;

        for(int r = 1; r <= size; r++) {
//            System.out.println("*****");
            // 1 шаг - 5 звездочек в ряд
            for(int c = 1; c <= r; c++) {
                System.out.print("*");
            }
            // 2 шаг - начать новую строку
            System.out.println();
        }
    }
}
