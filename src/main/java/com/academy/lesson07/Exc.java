package com.academy.lesson07;

import com.academy.lesson04.Person;
import com.academy.lesson05.Dancer;
import com.academy.lesson05.Gender;

public class Exc {
    public static void main(String[] args) {
        String data = "Ivan,Ivanov,26,m";
        String[] fields = data.split(","); // ["Ivan","Ivanov","26","m"]

        Person person = new Person();
        person.setFirstName(fields[0]);
        // lastName
        person.setLastName(fields[1]);
        // age
        person.setAge(Integer.valueOf(fields[2]));
        person.setGender(parse(fields[3]));
        System.out.println(person);

        Dancer dancer1 = new Dancer();
        Person dancer2 = new Dancer();
        Object dancer3 = new Dancer();

        dancer1.dance();
        ((Dancer)dancer2).dance();
        ((Dancer)dancer3).dance();


    }

    // 'f' => FEMALE, 'm' => MALE
    private static Gender parse(String value) {
        if (value.equals("m"))
            return Gender.MALE;

        if (value.equals("f"))
            return Gender.FEMALE;

        return null;
    }
}
