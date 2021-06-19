package com.academy.lesson11.ht;

import com.academy.lesson04.Person;
import com.academy.lesson05.Gender;
import com.academy.util.PropertyProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PersonGenerator {
    // Данные для генерации
    private final Gender[] GENDERS = {Gender.MALE,Gender.FEMALE}; // [0, 1]

    private List<String> manFirstNames;
    private List<String> womanFirstNames;
    private List<String> manLastNames;
    private List<String> womanLastNames;

    public PersonGenerator() {
        init();
    }

    private void init() {
        // Прочитать списки из файла
        String path = PropertyProvider.get("person.woman.firstnames");
        womanFirstNames = new ArrayList<>();
        //цикл чтений из файла
        // заполняем list
    }

    public Person nextPerson(int ageFrom, int ageTo) {
        Random random = new Random();

        int randomAge = ageFrom + random.nextInt(ageTo-ageFrom+1); // 4 + [0..87]
        Gender randomGender = GENDERS[random.nextInt(2)];
        String randomName;
        String randomLastName;

        if (randomGender == Gender.MALE) {
            randomName = manFirstNames.get(random.nextInt(manFirstNames.size())); // [0, ..., manFirstNames.length-1]
            randomLastName = manLastNames.get(random.nextInt(manLastNames.size()));
        } else {
            randomName = womanFirstNames.get(random.nextInt(womanFirstNames.size()));
            randomLastName = womanLastNames.get(random.nextInt(womanLastNames.size()));
        }

        Person person = new Person();
        person.setGender(randomGender);
        person.setAge(randomAge);
        person.setFirstName(randomName);
        person.setLastName(randomLastName);
        return person;
    }
}
