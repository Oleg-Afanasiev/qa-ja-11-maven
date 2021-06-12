package com.academy.lesson02;

public class Task5 {
    public static void main(String[] args) {
        // 1 Код монолитом
        int number = 162456;
        int sum = 0;

        while(number > 0) {
            System.out.println("next iteration");
            System.out.println(number % 10); // => 6
            System.out.println(number / 10); // => 16245
            sum += number % 10;
            number /= 10; // number = number / 10;
        }
        System.out.println(sum);

        // 2 Код через вызов метода
        System.out.println("****Call Method****");
        System.out.println(sumDigits(123));
        System.out.println(sumDigits(1234));
    }

    public static int sumDigits(int number) {
        int sum = 0;

        while(number > 0) {
            sum += number % 10;
            number /= 10; // number = number / 10;
        }

        return sum;
    }
}
