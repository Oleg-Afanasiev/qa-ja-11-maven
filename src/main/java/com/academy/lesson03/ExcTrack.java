package com.academy.lesson03;

public class ExcTrack {
    public static void main(String[] args) {
        String[] tracks={"track_01", "track_03", "track_21", "track_15",
                "track_12","track_99", "track_11", "track_10"};

        // =>
        // track_10
        // track_11
        // track_12
        // track_15
        for(int i = 0; i < tracks.length; i++) {
//            String lastDigits = tracks[i].substring(6); // track_01 => 01
//            Integer number = Integer.parseInt(lastDigits); // "01" => 1

            Integer number = detectTrackNumber(tracks[i]);

            if (number >= 10 && number <= 15) { // 10..15 &&
                System.out.println(tracks[i]);
            }
        }
    }

    public static Integer detectTrackNumber(String track) {
        String lastDigits = track.substring(6); // track_01 => 01
        Integer number = Integer.parseInt(lastDigits); // "01" => 1
        return number;
    }
}
