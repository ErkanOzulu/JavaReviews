package InterviewQuestions;

import java.util.Arrays;

public class Q13_VeilSystem {
    /*
    VeilSystems Company
    The problem we would like you to solve deals with an array of integers. We want to rotate these integers to a specified number of positions to the left.
If for example you have an array of integers [1,2,3,4,5,6,7] and we would like to rotate 2 positions to the left, the solution expected would be [3,4,5,6,7,1,2].
Note: the solution should be able to handle a position value greater than the number of integers in the array. If, for example, we would like to rotate [1,2,3,4,5,6,7] 8 positions to left, it would produce the result [2,3,4,5,6,7,1]. Negative values for the positions to rotate will throw an error which the code example should handle gracefully.
     */
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        shiftLeft(arr, 10);


    }

    private static void shiftLeft(int[] arr, int i) {

        if (i < 0) throw new RuntimeException("You can not use position number less than 0");

        i=i%arr.length;

        int[] firstPart = Arrays.copyOfRange(arr, 0, i);
        int[] secondPart = Arrays.copyOfRange(arr, i, arr.length);

        int[] first = myCopyOfRange(arr, 0, i);
        System.out.println("My custom copyOfRange method result" + Arrays.toString(first));

        System.out.println(Arrays.toString(firstPart) + " " + Arrays.toString(secondPart));

        int[] result = new int[arr.length];

        int indexOfResult = 0;

        for (int each : secondPart) {
            result[indexOfResult++]=each;

        }

        for (int each : firstPart) {
            result[indexOfResult++]=each;
        }


        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));

    }

    private static int[] myCopyOfRange(int[] arr, int from, int to) {

        int[] newArr=new int[to-from];

        int index=0;
        for (int i = from; i < to; i++) {

            newArr[index++]=arr[i];

        }



        return newArr;
    }
}
