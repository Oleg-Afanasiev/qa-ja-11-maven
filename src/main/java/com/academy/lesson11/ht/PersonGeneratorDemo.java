package com.academy.lesson11.ht;

import com.academy.lesson04.Person;

public class PersonGeneratorDemo {
    public static void main(String[] args) {
        PersonGenerator generator = new PersonGenerator();
        Person person = generator.nextPerson(4, 90);
        System.out.println(person);
    }
}
