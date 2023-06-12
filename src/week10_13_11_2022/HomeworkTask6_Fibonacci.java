package week10_13_11_2022;

import java.util.Arrays;

public class HomeworkTask6_Fibonacci  {
    public static void main(String[] args) {

    int[] result=fibonacci(8);
        System.out.println(Arrays.toString(result));

}

    public static int[] fibonacci(int a) {
        int []arr=new int[a+1];
        arr[0]=0;
        arr[1]=1;

        for (int i = 2; i < arr.length; i++) {

            arr[i]=arr[i-1]+arr[i-2];

        }



        return  arr;

    }

}


/*
Task 6 :  Fibonacci
				Create a method that will give you the Fibonacci numbers up to the x value. Where x is the given parameter.
				Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers
				Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc
				    Ex:
				        Input:
				            8
				        Output:
				           1, 1, 2, 3, 5, 8, 13, 21
				            1- Create one method and only print the numbers
				            2- You will return the numbers
				            3- Yuo will put that numbers into the array then you will return it
				         */