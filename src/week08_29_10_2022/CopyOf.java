package week08_29_10_2022;

import java.util.Arrays;

public class CopyOf {
    public static void main(String[] args) {

        String[] arr = {"java","longer word","civic","apple","racecar","mom","anna"};

        String[] arr2= Arrays.copyOf(arr,3);
        System.out.println(Arrays.toString(arr2));

        String[] arr3=Arrays.copyOfRange(arr,0,7);
        System.out.println(Arrays.toString(arr3));
    }
}
