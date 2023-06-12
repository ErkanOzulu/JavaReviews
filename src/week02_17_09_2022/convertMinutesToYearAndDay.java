package week02_17_09_2022;

public class convertMinutesToYearAndDay {
/*
Create class named ConvertMinutesToYearAndDay, write a Java program to convert minutes into a number of years and days.

     Input the number of minutes: 3456789
     Expected Output :
     3456789 minutes is approximately 6 years and 210 days

        1 minute =60 second;
        1 hour =60 minutes;
        1 day=24 hour; (24*60*60 seconds)
 */

    public static void main(String[] args) {


        int givenMinutes = 3456789;
        int day = givenMinutes / (24 * 60);
        int years = day / 365;
        int remainingDays = day % 365;
        int remainingHours = remainingDays % 24;
        int remainingMinute = remainingHours % 60;

        System.out.println(givenMinutes + " minutes is approximately " + years + " years and " + remainingDays + " days " + remainingHours + " hours " + remainingMinute + "  minutes.");

/*
int minute = 3456789;
        int hour = minute / 60;
        int days = hour / 24;
        int year = days / 365;
        int day = days % 365;


        System.out.println(minute + " minutes is approximately " + year + " years and " + day + " days");
 */

        System.out.println("--------------------------------------");

        /*
        how many minutes we have in an hour? 60 min we have in one hour
        how many hours we have in a day ? we have 24 hours we have in a day
        how many days we have in a year? 365 a day in a year (it means that 24*365 hours) (it means that 24*365*60 minutes)
         */


        int howManyMinutesInAYear = (365 * 24 * 60);
        int year = givenMinutes / howManyMinutesInAYear;
        System.out.println("year = " + year);
        int remainderMinutes = givenMinutes % howManyMinutesInAYear;
        int days = remainderMinutes / (24 * 60);
        System.out.println("days = " + days);
        int remainderMinutes1 = remainderMinutes % (24 * 60);
        int hours = remainderMinutes1 / 60;
        System.out.println("hour=" + hours);
        int remainderMinutes2 = remainderMinutes1 % 60;
        System.out.println(givenMinutes + " minutes  is approximately " + year + "years," + days + "days," + hours +
                "hours," + remainderMinutes2 + "minutes.");


    }
}


