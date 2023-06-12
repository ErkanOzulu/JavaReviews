package week09_05_11_2022;

public class H2_Frontback {
    public static void main(String[] args) {

        frontback( "Ahmet");

    }

    private static void frontback(String word) {

        char ch1=word.charAt(0);
        char ch2=word.charAt(word.length()-1);
        String body=word.substring(1,word.length()-1);
        word=ch2+body+ch1;
        System.out.println(word);
    }


}

/*
Task 6 : Write a method that return a new string where the first and last chars have been exchanged.


             frontBack("code") → "eodc"
             frontBack("a") → "a"
             frontBack("ab") → "ba"



 */