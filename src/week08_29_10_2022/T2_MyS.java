package week08_29_10_2022;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class T2_MyS {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter  how many entry will you make");
        int length = scan.nextInt();
        scan.nextLine();
        String[] words = new String[length];
        for (int i = 0; i < length; i++) {
            words[i] = scan.nextLine();

        }
        for (String each : words) {
            if (each.contains(" ")) {
                System.out.println(each);
            }


        }
    }
}



/*
Task 2 :    Write a program that accepts string and prints multiple words in the string

        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”

        output : wooden spoons
                 trash can
                  dish washer
 */