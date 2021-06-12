package com.academy.lesson06;

import com.academy.lesson04.Person;
import com.academy.lesson05.Gender;

public class EnumDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setGender(Gender.FEMALE);
        person.setGender(Gender.MALE);

        String personData1 = "Ivan,Ivanov,23,m";
        String personData2 = "Helen,Sidorova,24,f";

        char ch = 'm';
        Gender male = Gender.parse("f"); // => MALE
        Gender female = Gender.parse("m"); // => MALE
        System.out.println(male);
        System.out.println(female);

        Gender[] values = Gender.values();
        for(int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        System.out.println(Gender.MALE.ordinal());
        System.out.println(Gender.FEMALE.ordinal());
        System.out.println(Gender.FEMALE.name());
    }
}
