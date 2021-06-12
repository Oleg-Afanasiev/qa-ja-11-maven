package com.academy.lesson05;

public enum Gender {
    MALE("мужч"),
    FEMALE("женщ");

    private String ruValue;

    Gender(String ruValue) {
        this.ruValue = ruValue;
    }

    public static Gender parse(String val) {
        if ("f".equals(val))
            return FEMALE;
        else
            return MALE;
    }

    @Override
    public String toString() {
//        if (this == MALE)
//            return "мужчина";
//        else
//            return "женщина";
        return ruValue;
    }
}
