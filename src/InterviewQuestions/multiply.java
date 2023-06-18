package InterviewQuestions;

import java.util.Arrays;

public class multiply {
    

    public static void main(String[] args) {
arraysmultipl();

        int []k= {-1, 3, 4, 5, 3, 2};

        System.out.println(Arrays.toString(k));
        int[] arr=new int[k.length];

        for (int i = 0; i < k.length; i++) {
            arr[i]=k[i]*k[i];

        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


    }

    private static void arraysmultipl() {
    }
}
