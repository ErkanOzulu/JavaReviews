package week05_08_10_2022;

import java.util.Scanner;

public class RedOrBlue {
    public static void main(String[] args) {


        String scan=new Scanner(System.in).nextLine();
        String result="";
        if (scan.startsWith("red")){

            result="Red";
        } else if (scan.startsWith("Blue")) {
            result="Blue";
        }else
result="";

        System.out.println(result);


    }
}
/*
 Task 4: Given a string, if the string begins with "red" or "blue" print that color string, otherwise print the empty string.

     *                 input :"redxx" → "red"
     *                 input :"xxred" → ""
     *                 input :"blueTimes" → "blue"
 */