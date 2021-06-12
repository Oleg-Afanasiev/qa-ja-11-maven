package com.academy.lesson06;

import com.academy.lesson04.Person;
import com.academy.lesson05.Dancer;
import com.academy.lesson05.QA;
import com.academy.lesson05.hometask.CustomDate;
import com.academy.lesson05.hometask.CustomDateTime;

public class Polymorphism {
    public static void main(String[] args) {
        CustomDate date = new CustomDate();
        CustomDateTime dt = new CustomDateTime();

        System.out.println(date);
        System.out.println(dt);

        // Полиморфизм
        // Пример 1
        System.out.println("Пример 1");
        CustomDateTime dtPoly = new CustomDateTime();
        CustomDate dtPoly2 = new CustomDateTime();
        Object dtPoly3 = new CustomDateTime();

        System.out.println(dtPoly);
        System.out.println(dtPoly2);
        System.out.println(dtPoly3);

        // Пример 2
        System.out.println("Пример 2");
        Person person = new Person();
        Dancer dancer = new Dancer();
        Person dancer2 = new Dancer();

        System.out.println(person);
        System.out.println(dancer);
        System.out.println(dancer2);

        // Пример 3
        System.out.println("Пример 3");
        // Dancer dancer3 = new Person(); // так не работает
        QA qa = new QA();

        Person[] group = {qa, dancer, person};
        for (int i = 0; i < group.length; i++) {
            System.out.println(group[i]);
        }

        System.out.println("--group2--");
        Object[] group2 = {qa, dancer, person, "Hello world", 123};
        for (int i = 0; i < group2.length; i++) {
            System.out.println(group2[i]);
        }

        // Издержки
        Object number1 = 1;
        Object number2 = 2;
//        Object sum = number1 + number2; // Ошибка компиляции
//        System.out.println(sum);

        Dancer dancer3 = new Dancer();
        dancer3.dance();
        Person dance4 = new Dancer();
        Dancer dancerFromPerson = (Dancer)dance4;
        dancerFromPerson.dance();

        Person somebody = new Dancer();
        if (somebody instanceof Dancer) {
            Dancer dancerNotQAFromPerson = (Dancer) somebody;
            dancerNotQAFromPerson.dance();
        } else {
            System.out.println("не танцор");
        }
    }
}
