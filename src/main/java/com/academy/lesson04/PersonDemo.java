package com.academy.lesson04;

public class PersonDemo {
    public static void main(String[] args) {
//        Person person = new Person();
//        String profile = person.getProfile();
//        System.out.println(profile);

        Person[] group = new Person[10];

        for(int i = 0; i < group.length; i++) {
            group[i] = generateRandomPerson();
        }

        for(int i = 0; i < group.length; i++) {
            System.out.println(group[i].profile());
        }
    }

    public static Person generateRandomPerson() {
        Person person = new Person();
        person.setFirstName("Random Name");
        person.setLastName("Random Last Name");

        return person;
    }
}
