package com.academy.lesson07;

import com.academy.lesson04.Person;

public class Genius extends Person implements Developer, Boxer{
    @Override
    public void boxing() {
        System.out.println("boxing 3 times per week");
    }

    @Override
    public void codding() {
        System.out.println("codding every day");
    }

    @Override
    public void codeReviewing() {
        System.out.println("codding reviewing sometimes");
    }

    @Override
    public String toString() {
        return "Genius";
    }
}
