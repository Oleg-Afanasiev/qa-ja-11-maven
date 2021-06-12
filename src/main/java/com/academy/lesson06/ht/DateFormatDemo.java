package com.academy.lesson06.ht;

import com.academy.lesson05.hometask.CustomDate;
import com.academy.lesson05.hometask.DateFormat;

public class DateFormatDemo {
    public static void main(String[] args) {
        CustomDate date = new CustomDate();
        System.out.println(date.getFormattedDate(DateFormat.USA));
        System.out.println(date.getFormattedDate(DateFormat.RU));
    }
}
