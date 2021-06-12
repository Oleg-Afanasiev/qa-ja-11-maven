package com.academy.lesson07;

public interface Developer {
    void codding();
    void codeReviewing();
    default void interviewing() {
        System.out.println("interviewing");
    }
}
