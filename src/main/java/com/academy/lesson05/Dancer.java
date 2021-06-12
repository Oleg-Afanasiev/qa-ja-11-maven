package com.academy.lesson05;

import com.academy.lesson04.Person;

public class Dancer extends Person {
    private String danceStyle;

    public Dancer() {
    }

    public Dancer(String firstName, String lastName, String danceStyle) {
        super(firstName, lastName);
        this.danceStyle = danceStyle;
    }

    public String getDanceStyle() {
        return danceStyle;
    }

    public void setDanceStyle(String danceStyle) {
        this.danceStyle = danceStyle;
    }

    public void dance() {
        System.out.println("I'm dance " + danceStyle);
    }

    @Override
    public String toString() {
        return "Dancer";
    }
}
