package com.academy.lesson03;

import java.util.Arrays;

public class ExcNames {
    public static void main(String[] args) {
        String data = "petrov,Ivanov ,KiRill, Helen ";
        String[] names = data.split(",");
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            // обрезаем пробелы
            name = name.trim();
            // Первый символ в верхний регистр
            char firstLetter = name.charAt(0);
            firstLetter = Character.toUpperCase(firstLetter);

            // Остальные символы - в нижний
            String otherLetter = name.substring(1);
            otherLetter = otherLetter.toLowerCase();

            names[i] = firstLetter + otherLetter;
        }
        // => [Petrov,Ivanov,Kirill,Helen]
        System.out.println(Arrays.toString(names));
    }
}
