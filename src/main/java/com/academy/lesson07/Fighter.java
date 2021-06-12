package com.academy.lesson07;

import com.academy.lesson04.Person;

public class Fighter extends Person implements Boxer {
    @Override
    public void boxing() {
        System.out.println("Boxing");
    }
}
