package week08_29_10_2022;

public class SplitEmptySpace {
    public static void main(String[] args) {
        //to match multiple empty spaces

        String sentence = "Java  is    a    good     language.";

        String[] words = sentence.split("\\s+");//split("\\s+") will split the string into string of array with separator as space or multiple spaces. \s+ is a regular expression for one or more spaces.
        for (String each: words) {
            System.out.println(each.replace(".",""));
        }
    }
}
