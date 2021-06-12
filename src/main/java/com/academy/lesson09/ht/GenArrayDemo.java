package com.academy.lesson09.ht;

import com.academy.lesson04.Person;
import com.academy.lesson07.ht.PersonGenerate;

public class GenArrayDemo {
    public static void main(String[] args) {
        String[] array = new String[10];
        // Создать класс GenArray<String> размера 10
        GenArray<String> genArray = new GenArray<>(new String[10]); // *
        // Записать 2-ой элемент "hello"
        genArray.set(2, "hello");
        // Прочитать этот элемент
        String actualValue = genArray.get(2); // => "hello"
        String expectedValue = "hello";
        System.out.println(actualValue); // => "hello"
        assert expectedValue.equals(actualValue);

        // Записать 11-ый элемент "world"
        // Получить exception
        GenArray<Person> genArrayPerson = new GenArray<>(new Person[10]);
        // set Person with name 'Vasya'
        // check name from genArrayPerson is Vasya
        for (int i = 0; i < 10; i++) {
            Person person = PersonGenerate.nextPerson(4, 90);
            genArrayPerson.set(i, person);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(genArrayPerson.get(i));
        }

    }
}
