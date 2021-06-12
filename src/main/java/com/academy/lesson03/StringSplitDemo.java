package com.academy.lesson03;

import java.util.Arrays;

public class StringSplitDemo {
    public static void main(String[] args) {
        String str = "track_01,track_02,track_03";
        String[] tracks = str.split(",");
        System.out.println(tracks.length);
        System.out.println(tracks[0]);
        System.out.println(Arrays.toString(tracks));
    }
}
