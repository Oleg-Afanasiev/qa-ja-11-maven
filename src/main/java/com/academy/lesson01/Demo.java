package com.academy.lesson01;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.print("Peter");
        System.out.println("Helen");

        // 1 способ
        System.out.printf("My name %s. Age: %d", "Vasya", 15);

        // 2 способ
        System.out.print("My name Vasya. Age: 15");

        System.out.println("\nOne\n\t Two\n Three");
        System.out.println("\"\\n\"");

        // Чтение из консоли
        Scanner scanner = new Scanner(System.in);
        String msg = scanner.nextLine();
        System.out.printf("Вы ввели %s%n", msg);
    }
}
