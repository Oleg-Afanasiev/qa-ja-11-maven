package com.academy.lesson07;

import com.academy.lesson04.Person;

public class MiddleDev extends Person implements Developer {

    @Override
    public void codding() {
        System.out.println("codding");
    }

    @Override
    public void codeReviewing() {
        System.out.println("code reviewing");
    }

    @Override
    public String toString() {
        return "MiddleDev";
    }
}
