package week06_15_10_2022;

public class T1_CountSpecificWord {
    public static void main(String[] args) {
        String str = "Java is java in everywhere is Java";
        String word = "Java";
        int count=0;
        for (int i = 0; i <=str.length()-4 ; i++) { //(int i = 0; i <=str.length()-word.length ; i++)
            String sub=str.substring(i,i+4);  // str.substring(i,i+word.length)

            if (sub.equalsIgnoreCase("Java"))// (sub.equalsIgnoreCase(word))
            count++; // if we have only one statement after if statement we don't need to use {}

        }
        System.out.println(count);

    }
}
/*
Task 1: Given a sentence which is string find word how many times repeats in it.

Hint: use substring with for loop

input:
*                                String str="Java is java in everywhere is Java";
*                                String word="Java";
output:3
 */