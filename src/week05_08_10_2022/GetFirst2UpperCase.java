package week05_08_10_2022;

import java.util.Scanner;

public class GetFirst2UpperCase{
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter a word");
String as=scan.next();

         String b =""+as.charAt(0)+as.charAt(1);
         String result=b.toUpperCase();

        System.out.println(result);
       /*
       String result=""+word.charAt(0)+word.charAt(1);
        String result2=word.charAt(0)+""+word.charAt(1);

        System.out.println(result.toUpperCase());
        System.out.println(result2.toUpperCase());
        */


        scan.close();
    }
}
/*
Task 1: Given a string, print the string made of its first two chars, so the String "Hello" yields “HE".
 */