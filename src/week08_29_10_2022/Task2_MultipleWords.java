package week08_29_10_2022;

import java.util.Arrays;

public class Task2_MultipleWords {
    public static void main(String[] args) {
        /*
        Task 2 :	Write a program that accepts string and prints multiple words in the string
        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer"
        output : wooden spoons
        		 trash can
         		 dish washer
         */

        String str="knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";

       String[] str2= str.split(", ");  //str.split(", ") this point is important.Because if we were use only " " it would split multiple words so we wouldn't get multiple words

        for (String each : str2) {
            if (each.contains(" ")){ // condition for multiple words
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