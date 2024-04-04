package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q6_Median {

    public static void main(String[] args) {

       int[] arr = {-1, 5, 13, 8, 2, 3, 3, 1};
       int k = 4;

        int arr2[] = {-1, 5, 13, 8, 2, 3, 3, 1}, l = 4;
        List<Double> medians = separateWindowWithSize(arr, k);
        List<Double> medians2 = separateWindowWithSize(arr2, l);

        System.out.println(medians);
        System.out.println(medians2);
    }

    private static List<Double> separateWindowWithSize(int[] arr, int k) {
        int[] subArr2=new int[k];
        List<Double>result=new ArrayList<>();
        for (int i = 0; i <= arr.length-k; i++) {

            int[] subArr = Arrays.copyOfRange(arr, i, i + k);


            Arrays.sort(subArr);
            System.out.println(Arrays.toString(subArr) );
            if (k%2!=0) {
                result.add((double)subArr[k / 2]);
            }else{
                double mid=(subArr[k/2]+subArr[(k/2)-1])/2;
                result.add(mid);
            }


        }

        return result;
    }

    public static int[] findSubArray(int[] array, int start, int end) {
        // Check for valid start and end parameters
        if (start < 0 || end > array.length || start > end) {
            throw new IllegalArgumentException("Index out of bounds");
        }

        // Initialize a new array of the subarray's size
        int[] subArray = new int[end - start];

        // Copy elements from the original array to the subarray
        // excluding the last parameter
        // assigning copy part of original array to the new created subArray
        for (int i = start; i < end; i++) {
            subArray[i - start] = array[i];
        }

        return subArray;
    }
}


/*
Median of sliding window in an array
Given an array of integer arr[] and an integer k, the task is to find the median of each window of size k starting from the left and moving towards the right by one position each time.
Examples:
Input: arr[] = {-1, 5, 13, 8, 2, 3, 3, 1}, k = 3
Output: 5 8 8 3 3 3
Input: arr[] = {-1, 5, 13, 8, 2, 3, 3, 1}, k = 4
Output: 6.5 6.5 5.5 3.0 2.5

-1, 5, 13

-1, 5, 13 == > median=5


-1, 5, 13, 8

-1 5 8 13 median=(5+8)/2 =6.5

 */