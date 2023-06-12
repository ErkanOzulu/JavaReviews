package week02_17_09_2022;

import java.time.LocalDateTime;

public class BonusForWeek {

    public static void main(String[] args) {
        /*
        write a java program that prints the current time.
        hour:minutes:seconds

         */
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        int hour = today.getHour();
        System.out.println(hour);

        int minute = today.getMinute();
        System.out.println(minute);

        int second = today.getSecond();
        System.out.println(second);
        System.out.println(hour+" : "+minute+" : "+second);


    }
}
