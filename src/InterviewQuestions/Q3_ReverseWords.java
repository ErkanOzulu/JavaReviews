package InterviewQuestions;

import java.util.Arrays;
import java.util.Collection;

public class Q3_ReverseWords {
    public static void main(String[] args) {

        String str="apple banana kiwi";

        String rev=reverseWords(str);
        System.out.println(rev);
    }

    private static String reverseWords(String str) {

        String[] words=str.split(" ");
        String[] reverse=new String[words.length];
        String rev="";

        for (int i = words.length - 1,j=0; i >= 0; j++,i--) {
            reverse[j]=words[i];

        }
        for (String s : reverse) {
            rev+=s+" ";
        }
        return rev.trim();

        }
        /*
        with StringBuilder
          StringBuilder reversedWords = new StringBuilder();

    // split input string by " " space to get each word as String[]
    String[] words = str.split(" ");

    // loop over the array from back
    for(int i = words.length - 1; i >= 0; i--) {
      // add words to reversedWords with space
      reversedWords.append(words[i] + " ");
    }

    // trim needed to remove last space in the end
    return reversedWords.toString().trim();
         */
    }



/*
3. Reverse words. Write a method that will take a string as an argument. The method will reverse the position of words and return it.
// revWords("apple banana kiwi") -> "kiwi banana apple"
  // revWords("I am John Doe")     -> "Doe John am I"
  // revWords("orange")            -> "orange"
 */