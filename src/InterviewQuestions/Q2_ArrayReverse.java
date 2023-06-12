package InterviewQuestions;

import java.util.Arrays;

public class Q2_ArrayReverse {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] reverse=reverseArray(arr);
        System.out.println(Arrays.toString(reverse));

    }

    public static int[]reverseArray(int[] arr){

        int[] reverse=new int[arr.length];
        for (int i = arr.length - 1,j=0; i >= 0; i--,j++) {
            reverse[j]=arr[i];
        }
        return reverse;
/*
second way
 public void revArr(int[] arrNum) {
    // we will use two 'pointers'. One pointer will start from the beginning
    // another one from the back and we will swap their values

    // pointer that will start from the back
    int j = arrNum.length - 1;

    // our loop will go till half of our input array
    // 'i' is a pointer that will start from the beginning
    for(int i = 0; i < arrNum.length / 2; i++) {
      // swap elements using positions of i and (j - i)
      int tmp = arrNum[i];
      arrNum[i] = arrNum[j - i];
      arrNum[j - i] = tmp;
    }
 */

    }
}


/*
2. Array reverse. Write a method that will take an array as an argument and reverse it.
// revArr({1, 2, 3, 4, 5}) -> {5, 4, 3, 2, 1}
  // revArr({1})             -> {1}
  // revArr({1, 2, 3})       -> {3, 2, 1}

 */