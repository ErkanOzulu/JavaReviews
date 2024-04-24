package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q10_FindMax_Min {
  /*

     -  Write a function that can find the maximum number from an int Array
     -  Write a function that can find the min number from an int Array

    */


    public static void main(String[] args) {

        int[] array = {41, 21, 6, 14, 5};

        int min = findMin1(array);
        System.out.println(min);
        System.out.println(findMin2(array));


        int max1 = findMax1(array);
        int result2 = findMax2(array);
        System.out.println(max1);
        System.out.println(result2);
    }

    private static int findMin2(int[] array) {
        int min = array[0];

        for (int i : array) {

            min = (i < min) ? i: min;

        }

        return min;
    }

    private static int findMin1(int[] array) {
        Arrays.sort(array);
        return array[0];

    }

    private static int findMax2(int[] array) {

        Arrays.sort(array);


        return array[array.length - 1];

    }

    private static int findMax1(int[] array) {

//        int max = Integer.MIN_VALUE; //another way

        int max = array[0];

        for (int i = 0; i < array.length; i++) {

            max = (array[i] > max) ? array[i] : max;

        }


        return max;
    }

}
