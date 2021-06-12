package com.academy.lesson03;

public class HomeTask {
    public static void main(String[] args) {
        String str = "ABcABDABeAB";
        String target = "AB";

        int count = 0;
        int index = str.indexOf(target); // смотрим с начала строки

        while(index != -1) {
            count++;
            index = str.indexOf(target,  index + target.length()); // смотрим с позиции index+2
        }

        System.out.println(count); // => 3

        // Развернуть строку
        String str2 = "abcd";
        String reversed = ""; // "d" + "c" +...
        for (int i = str2.length() - 1; i >= 0;  i--) {
            reversed += str2.charAt(i);
        }
        System.out.println(reversed);

        // Проверим на палиндром
        String str3 = "abcdcba";
        System.out.println(isPalindrome(str2));
        System.out.println(isPalindrome(str3));
    }

    public static boolean isPalindrome(String str) {
        for(int first = 0, last = str.length()-1; first <= last ;first++, last--) {
            if(str.charAt(first) != str.charAt(last)) {
                return false;
            }
        } // end for
        return true;
    }
}
