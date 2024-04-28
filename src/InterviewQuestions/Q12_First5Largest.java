package InterviewQuestions;

import java.util.Arrays;

public class Q12_First5Largest {
     /*
    Amazon
    Given an array of integers , print first 5 largest numbers
     int[] array = {1, 2, 3, 4, 5, 6, 7};

     7,6,5,4,3
     */

    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 5, 6, 7, 20, 15};

//             String str= print_five_largest(array);
        String str1 = print_five_largest2(array);
//              System.out.println(str);
        System.out.println(str1);
    }

    private static String print_five_largest2(int[] array) {
//if we don't have permission to use the sort method

        if (array.length < 5) throw new RuntimeException("Your array doesn't have 5 or more elements");

        String result = "";

        for (int k = 0; k < 5; k++) {

            int max = array[0];

            int indexOfMax = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                    indexOfMax = i;
                }
            }
            array[indexOfMax] = Integer.MIN_VALUE;

            result += max + " ";

        }

        return result;

    }


    private static String print_five_largest(int[] array) {


        Arrays.sort(array);
        String result = "";
        for (int i = array.length - 1; i >= array.length - 5; i--) {
            result += array[i] + "  ";

        }
/*
            result = array[array.length - 1] + " - "
                    + array[array.length - 2] + " - "
                    + array[array.length - 3] + " - "
                    + array[array.length - 4] + " - "
                    + array[array.length - 5] ;


 */

        return result;
    }


}
