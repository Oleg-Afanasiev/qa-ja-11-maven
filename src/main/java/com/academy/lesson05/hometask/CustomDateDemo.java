package com.academy.lesson05.hometask;

public class CustomDateDemo {
    public static void main(String[] args) {
        CustomDate date = new CustomDate();
        CustomDate date2 = new CustomDate(23, 3, 2020);
        CustomDate date3 = new CustomDate(23, 3, 2020);

        System.out.println(date); // -> 1.1.1970
        System.out.println(date2); // -> 23.03.2020

        System.out.println(date.equals(date2)); // => false
        System.out.println(date2.equals(date3)); // => true

        CustomDateTime dateTime = new CustomDateTime();
//        CustomDateTime dateTime2 = new CustomDateTime(23, 3, 2020, 12, 15, 9);
        CustomDateTime dateTime2 = new CustomDateTime()
                .withHour(12)
                .withMinute(15)
                .withSecond(9)
                .withYear(2023)
                .withMonth(3)
                .withDay(23);

        CustomDateTime dateTime3 = new CustomDateTime(23, 3, 2020, 12, 15, 9);
        System.out.println(dateTime); // -> 01.01.1970 00:00:00
        System.out.println(dateTime2); //-> 23.03.2020 12:15:09
        System.out.println(dateTime3); //-> 23.03.2020 12:15:09

        System.out.println(dateTime.equals(dateTime2)); // => false
        System.out.println(dateTime2.equals(dateTime3)); // => true
    }
}
