package com.academy.lesson11.excel;

import com.academy.lesson04.Person;
import com.academy.lesson07.ht.PersonGenerate;

public class GenerateExcelDemo {
    public static void main(String[] args) {
        Person person = PersonGenerate.nextPerson(4, 90);
        System.out.println(person);
    }
}
