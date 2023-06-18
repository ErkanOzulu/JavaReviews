package InterviewQuestions;

import java.util.Arrays;

public class multiply {
    

    public static void main(String[] args) {


        int []k= {-1, 3, 4, 5, 3, 2};


        multiply(k);
        Arrays.sort(k);
        System.out.println(Arrays.toString(k));

    }

    public static int[] multiply(int[] a){

        int[] arr=new int[a.length];

        for (int i = 0; i < a.length; i++) {
            arr[i]=a[i]*a[i];

        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr;
    }

}
