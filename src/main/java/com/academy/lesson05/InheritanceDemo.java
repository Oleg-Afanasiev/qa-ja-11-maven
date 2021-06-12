package com.academy.lesson05;

import com.academy.lesson04.Person;

public class InheritanceDemo {
    public static void main(String[] args) {
        QA qaMember = new QA("Sidor", "Sidorov", 3);

//        qaMember.setExperience(3);

        System.out.println(qaMember.getFirstName());
        System.out.println(qaMember.getLastName());
        System.out.println(qaMember.getExperience());
        System.out.println("---profile---");
        System.out.println(qaMember.profile());
        System.out.println("---toString---");
        System.out.println(qaMember);
//        System.out.println(qaMember.profile());

        Dancer dancer = new Dancer("Ivan", "Ivanov", "Rumba");
//        dancer.setFirstName("Ivan");
//        dancer.setLastName("Ivanov");
//        dancer.setDanceStyle("Rumba");

        dancer.dance();

        Person person = new Person();
//        person.firstName = "Ivan";

        Empty empty = new Empty();
        System.out.println(empty);
        System.out.println(empty.toString());
    }
}
