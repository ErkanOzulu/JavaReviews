package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q6_2_SubarrayGenerator {
    
    public static List<int[]> getSubarrays(int[] arr) {
        List<int[]> subarrays = new ArrayList<>();
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int[] subarray = new int[j - i];
                for (int k = i; k < j; k++) {
                    subarray[k - i] = arr[k];
                }
                subarrays.add(subarray);
            }
        }
        
        return subarrays;
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4};
        List<int[]> subarrays = getSubarrays(originalArray);
        
        // Print subarrays
        for (int[] subarray : subarrays) {
            for (int num : subarray) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}