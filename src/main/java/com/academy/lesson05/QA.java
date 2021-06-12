package com.academy.lesson05;

import com.academy.lesson04.Person;

public class QA extends Person {
    private int experience;

    public QA() {
    }

    public QA(String firstName, String lastName, int experience) {
        super(firstName, lastName); // вызов конструктора базового класса (должен вызываться первым)
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "QA";
    }

    @Override
    public String profile() {

//        return firstName + "," + lastName + "," + experience + " years experience";
//        super.getLastName();
        return super.profile() + "," + experience + " years experience";
    }
}
