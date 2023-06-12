package week08_29_10_2022;

import java.util.Arrays;

public class T1_RotateLeft {
    public static void main(String[] args) {
      /*

        int[] x = {1,2,3};             // = > [2,3,1]
        x[0]=x[1];
        x[1]=x[2];
        x[2]=x[0];
        */
   /*
        int temp=x[0];
        //first place = 2
        x[0]=x[1];
        //second place=3
        x[1]=x[2];
        last=1
        x[2]=temp;
         */
        int[] x = {1, 2, 3};
        int temp = x[0];

        for (int i = 0; i < x.length - 1; i++) {
            x[i] = x[i + 1];
        }

        x[x.length - 1] = temp;
        System.out.println(Arrays.toString(x));


    }


}

/*
Task 1    : Write a program that accepts an array and prints an array with the elements "rotated left”

        int[] x = {1,2,3};             // = > [2,3,1]
        int[] y = {17,12,10,8};         // = > [12,10,8,17]
        int[] a = {7,0,0};              // = > [0,0,7]
 */