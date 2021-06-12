package com.academy.lesson05;

import com.academy.lesson04.Person;

public class EqualsDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Ivan", "Ivanov");
        Person p2 = new Person("Sidor", "Sidorov");
        Person p3 = new Person("Sidor", "Sidorov");

        System.out.println("==");
        System.out.println(p1 == p2);
        System.out.println(p2 == p3);

        System.out.println(".equals()");
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
    }
}
