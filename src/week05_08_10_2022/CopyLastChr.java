package week05_08_10_2022;


import java.util.Scanner;

public class CopyLastChr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word: ");
        String word = scan.next();

        String a = "" + word.charAt(word.length() - 1);

        String b = "" + word.charAt(word.length() - 2);
        System.out.println(b + a + b + a + b + a);
scan.close();
/*

        String word = "Hello";
        int indexOfLastChar = word.length() - 1; //index of o
        int indexOfSecondFromLast=word.length()-2;//index of l
        char last=word.charAt(indexOfLastChar);
        char beforeLast=word.charAt(indexOfSecondFromLast);
        String lastTwo=""+beforeLast+last;
        System.out.println(lastTwo+lastTwo+lastTwo);
        */
    }
}
/*
Task 2: Create a logic print a new string made of 3 copies of the last 2 chars of the original string.

      Hint: The string length will be at least 2.
 */