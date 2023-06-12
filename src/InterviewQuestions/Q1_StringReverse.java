package InterviewQuestions;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Collections;

public class Q1_StringReverse {
    public static void main(String[] args) {
        String reverse = reverseStr("apple");
        System.out.println(reverse);
    }

    private static String reverseStr(String str) {

        String reverse="";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse+=str.charAt(i);
        }
        return reverse;

       /*
       System.out.println("Secondway with StringBuilder");
        StringBuilder reverse = new StringBuilder();


        // iterate over input string from the back with charAt
        for(int i = str.length() - 1; i >= 0; i--) {
            // add chars to reversed variable
            reverse.append(String.valueOf(str.charAt(i)));
               // convert to string and return reversed version
        return reverse.toString();
    }*/
        }


}
/*
1. String reverse. Write a method that will take one string as an argument and will return the reverse version of this string.
 // reverseStr("apple")  -> elppa
  // reverseStr("John")   -> nhoJ
  // reverseStr("phone")  -> enohp
  // reverseStr("123456") -> "654321"
 */