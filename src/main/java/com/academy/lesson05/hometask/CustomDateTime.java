package com.academy.lesson05.hometask;

public class CustomDateTime extends CustomDate {
    private int hour;
    private int minute;
    private int second;

    public CustomDateTime() {
    }

    public CustomDateTime(int day, int month, int year,
                          int hour, int minute, int second) {
        super(day, month, year); // конструктор базового класса
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return super.toString() + " " + String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public CustomDateTime withHour(int hour) {
        this.hour = hour;
        return this;
    }

    public CustomDateTime withMinute(int minute) {
        this.minute = minute;
        return this;
    }

    public CustomDateTime withSecond(int second) {
        this.second = second;
        return this;
    }

    public CustomDateTime withDay(int day) {
        super.day = day;
        return this;
    }

    public CustomDateTime withMonth(int month) {
        super.month = month;
        return this;
    }

    public CustomDateTime withYear(int year) {
        super.year = year;
        return this;
    }
}
