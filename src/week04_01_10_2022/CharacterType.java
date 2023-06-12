package week04_01_10_2022;

public class CharacterType {
    public static void main(String[] args) {

        char ch='A';
boolean isUpperCase=ch>='A' && ch<='Z';
boolean isLowerCase=ch>='a'&& ch<='z';
boolean isNotAlphabetic=!isUpperCase&&isLowerCase;
String result=(isUpperCase)?"A is an UpperCase character":(isLowerCase)?"a is an LowerCase character":"0 is not an aplhabetic character";

        System.out.println(result);

        System.out.println("=====Second Way===========");

        if (isUpperCase){
            System.out.println(ch+" is an Upper Case character");
        }
        if (isLowerCase) {
            System.out.println(ch+" is an Lower Case character");
        }
        if (isNotAlphabetic){
            System.out.println(ch+" is not an alphabetic character");
        }
        System.out.println(result);






    }
}
/*
Given a character, the task is to check whether the given character is in upper case, lower case, or non-alphabetic         character

                            Input: ch = 'A'
                            Output: A is an UpperCase character

                            Input: ch = 'a'
                            Output: a is an LowerCase character

                            Input: ch = '0'
                            Output: 0 is not an aplhabetic character
 */