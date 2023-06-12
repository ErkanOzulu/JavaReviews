package week03_24_09_2022;

import java.util.SortedMap;

public class OxygenTank {
    public static void main(String[] args) {

int oxLevel=0;

String message="";

if (oxLevel>=90){

    message="Your tank is full.";
} else if (oxLevel>=80) {

    message="Still okay";
} else if (oxLevel>=70) {
    message="Don't go too far";

} else if (oxLevel>=60) {
    message="Start to head back";

}else {
    message="Be careful now you at %50.";
}
        System.out.println(message);

    }
}
/*
4. Create a class called OxygenTank. You are diving in the ocean. Your
oxygen tank has a certain level (number) and you must print a message
based on the level:
Above 90 -  Your tank is full
Above 80 -  Still okay
Above 70 -  Don't go too far
Above 60 -  Start to head back
Above 50 -  Be careful now you at 50%
USE ONE PRINT STATEMENT ONLY
 */