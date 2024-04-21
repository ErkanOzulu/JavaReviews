package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q8_WordBreak {



    public static void main(String[] args) {
        List<String> dictionary=List.of( "i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go", "mango");
        String input="ilikeicemobile";

       String output= breakInput(input,dictionary);
        System.out.println("output = " + output);


    }

    private static String breakInput(String input, List<String> dictionary) {
        String eachWord="";
        String result="";

        List<String>words=new ArrayList<>();


        int start=0;
        for (int i = 1; i <=input.length(); i++) {
          eachWord = input.substring(start, i);



          if (words.contains(eachWord)){
              i++;
              continue;
          }

            if (dictionary.contains(eachWord)){

                result+=eachWord+" ";
                words.add(eachWord);
               start+=eachWord.length();
            }


        }

        System.out.println("result = " + result);

        String s = result.trim().replaceAll(" ", "");
        return (s.equals(input))?"Yes":"No";
    }
}
/**

 2:Medium-Hard
  ***
 Word Break Problem
 Given an input string and a dictionary of words, find out if the input string can be segmented into a space-separated sequence of dictionary words. See following examples for more details.
 This is a famous Google interview question, also being asked by many other companies now a days.
 Consider the following dictionary
 { i, like, sam, sung, samsung, mobile, ice, cream, icecream, man, go, mango}
 Input:  ilike
 Output: Yes
 Input:  ilikesamsung
 Output: Yes
 ***
 */