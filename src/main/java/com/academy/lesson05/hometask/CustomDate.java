package com.academy.lesson05.hometask;

import com.academy.lesson08.ht.IllegalDateException;

public class CustomDate {
    protected int day;
    protected int month;
    protected int year;

    // конструктор по умолчанию
    public CustomDate() {
        day = 1;
        month = 1;
        year = 1970;
    }

    // конструктор со всем параметрами
    public CustomDate(int day, int month, int year) {
        if (month < 1 || month > 12)
            throw new IllegalDateException();


        if (day < 1 || day > countDaysInMonth(month))
            throw new IllegalDateException();

        // для дней
        this.day = day;
        this.month = month; // если месяц меньше 1 или больше 12 -> выбрасываем IllegalDateException
        this.year = year;
    }

    public int countDaysInMonth(int month) {
        // TODO
        if (month == 1 || month == 3)
            return 31;

        if (month == 2)
            return isLeap() ? 29 : 28;

        return 30;
    }

    public boolean isLeap() {
        if (this.year % 400 == 0)
            return true;

        if (this.year % 100 == 0)
            return false;

        if (this.year % 4 == 0)
            return true;

        return false;
    }

    @Override
    public String toString() {
        return String.format("%02d.%02d.%d", day, month, year);
    }

    public String getFormattedDate(DateFormat format) {
        switch (format) {
            case RU:
                return String.format("%02d.%02d.%d", day, month, year);

            case USA:
                return String.format("%02d-%02d-%d", month, day, year);

            default:
                return "";
        }
    }
}
