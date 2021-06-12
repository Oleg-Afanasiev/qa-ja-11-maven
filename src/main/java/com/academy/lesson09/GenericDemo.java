package com.academy.lesson09;

import com.academy.lesson04.Person;

public class GenericDemo {
    public static void main(String[] args) {
        Container container = new Container();
        container.setElement("Hello");

        String element = (String)container.getElement();
        System.out.println(element);

        System.out.println(element.toUpperCase());

        container.setElement(123);

        Integer number = (Integer)container.getElement();
        System.out.println(number + 1);

        if (container.getElement() instanceof  String) {
            String someElement = (String) container.getElement();
            System.out.println(someElement.toLowerCase());
        }

        // Generic Container
        System.out.println("--Generic Container--");
        GenericContainer<String> genericContainerStr = new GenericContainer<>();
        genericContainerStr.setElement("Hello");
        String msg = genericContainerStr.getElement();
        System.out.println(msg.toUpperCase());

        GenericContainer<Integer> genericContainerInt = new GenericContainer<>();
        genericContainerInt.setElement(123);
        Integer number2 = genericContainerInt.getElement();
        System.out.println(number2 - 1);

        // Generic Pair Container
        System.out.println("--Generic Pair Container--");
        PairContainer<Integer, String> pair = new PairContainer<>();
        pair.setFirst(1);
        pair.setSecond("one");
        System.out.println(pair.getFirst() + ":" + pair.getSecond());

        PairContainer<Integer, Person> pair2 = new PairContainer<>();
        Person person = new Person();
        person.setFirstName("Peter");

        pair2.setFirst(25);
        pair2.setSecond(person);
        Person person2 = pair2.getSecond();
        System.out.println(pair2.getFirst() + ":" + pair2.getSecond());

        PairContainer<String, PairContainer<Integer, Person>> complicated = new PairContainer<>();
        complicated.setFirst("try understand");
        // complicated.setSecond(pair); // ошибка компиляции
        complicated.setSecond(pair2);
    }
}
