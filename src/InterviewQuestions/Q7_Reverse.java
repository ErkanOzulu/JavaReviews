package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q7_Reverse {
    public static void main(String[] args) {

      String input="I am from California";

       String output=reverseString(input);
        System.out.println("output = " + output);

    }

    private static String reverseString(String input) {
        String output="";

        String[] words = input.split(" ");
/*
        ArrayList<Integer> lengths = new ArrayList<>();

        for (String word : words) {
            lengths.add(word.length());

        }

 */
        List<Integer> lengths = Arrays.stream(words).map(w -> w.length()).collect(Collectors.toList());


//        System.out.println("lengths = " + lengths);

        String nonSpace = input.replaceAll(" ", "");
//        System.out.println("nonSpace = " + nonSpace);

        String reversed = new StringBuilder(nonSpace).reverse().toString();

//        System.out.println("reversed = " + reversed);

        int start=0;
        for (Integer length : lengths) {

            String sub = reversed.substring(start, length+start);

            start+=length;

            output+=sub+" ";


        }


        return output.trim();
    }

}
/**
 * 1: Easy
 Create a method that reverse the given string with following output
     input:I am from California
     output:a in rofi IaCmorfmaI
 */

