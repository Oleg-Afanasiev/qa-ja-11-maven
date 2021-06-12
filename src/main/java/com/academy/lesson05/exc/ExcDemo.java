package com.academy.lesson05.exc;

import com.academy.lesson05.hometask.CustomDate;
import com.academy.lesson05.hometask.CustomDateTime;

public class ExcDemo {
    public static void main(String[] args) {
        CustomDate date = new CustomDate();
        CustomDateTime dateTime = new CustomDateTime();

        Object[] dateOrDateTime = {date, dateTime};
        for(int i = 0; i < dateOrDateTime.length; i++) {
            if(!(dateOrDateTime[i] instanceof CustomDateTime)) {
                System.out.println(dateOrDateTime[i]);
            }
        }
    }
}
