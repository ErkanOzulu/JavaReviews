package InterviewQuestions;

import javax.sound.midi.Soundbank;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q1_StringReverse {
    public static void main(String[] args) {

        String str="apple";
        String reverse = reverseStr(str);
        System.out.println(reverse);

        System.out.println("----------second way--------------");


        System.out.println(reverse2(str));
    }



    private static String reverseStr(String str) {

        String reverse="";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse+=str.charAt(i);
        }
        return reverse;

        }

    private static String reverse2(String str) {

        StringBuilder stringBuilder=new StringBuilder(str);

        return stringBuilder.reverse().toString();



    }


}
/*
1. String reverse. Write a method that will take one string as an argument and will return the reverse version of this string.
 // reverseStr("apple")  -> elppa
  // reverseStr("John")   -> nhoJ
  // reverseStr("phone")  -> enohp
  // reverseStr("123456") -> "654321"
 */