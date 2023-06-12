package week03_24_09_2022;

import javax.sound.midi.Soundbank;

public class CampusTime {
    public static void main(String[] args) {
        int time = 22;
        boolean open = time >= 8 && time < 23;

        if (open) {
            System.out.println("Open");

        } else {
            System.out.println("Closed");
        }

        System.out.println("------second way------");


        int time2 = 0;
        String result="";
        if (time2 >= 0 && time2 <= 24) {

            if (time2>=8 && time2<=23){

                result="Open";
            }else {
                result="Closed";
            }
        } else {
          result="Invalid Date";
        }
        System.out.println(result);
    }
}
/*
1. Create a class called CampusTime, an integer variable named time is
given with a number between 1~24 has been initialized, write a program
that can find out if the campus is open or not. Campus is open from 8
am(8) to 11 pm (23) If user enters a time within the open time they
should see message: “open”  but if the time entered is outside of
operating hours they should see: “ closed”

 */