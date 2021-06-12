package com.academy.lesson08.ht;

import com.academy.lesson05.hometask.CustomDate;

public class CustomDateDemo {
    public static void main(String[] args) {
        CustomDate correctDate1 = null;
        try {
            correctDate1 = new CustomDate(21, 6, 2021);
        } catch (IllegalDateException e) {
            assert false;
        }

        System.out.println(correctDate1);
        try {
            CustomDate inCorrectDate2 = new CustomDate(21, 16, 2021);
            System.out.println(inCorrectDate2);
            assert false;
        } catch (Exception e) {
            System.out.println("Ошибка. неверная дата");
        }
    }
}
