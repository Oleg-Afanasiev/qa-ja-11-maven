package com.academy.lesson04;

import com.academy.lesson05.Gender;

import java.util.Objects;

public  class Person {
    // поля
    protected String firstName; // поле доступно и для наследников
    protected String lastName;
    private Integer age;
    private Gender gender; // 'f', 'm'

    // конструкторы
    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // методы
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

//    @Override
//    public String toString() {
//        return profile();
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

//    @Override
//    public boolean equals(Object obj) {
//        Person other = (Person)obj;
//        return this.firstName.equals(other.getFirstName());
//    }

    public String profile() {
        return firstName + "," + lastName;
    }
}
