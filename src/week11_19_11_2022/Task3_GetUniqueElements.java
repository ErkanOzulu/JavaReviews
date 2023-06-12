package week11_19_11_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3_GetUniqueElements {
    public static void main(String[] args) {


       int [] first={1,2,3,4,5,5,5,6};
       int [] second={4,5,6,6,6,7};
       ArrayList<Integer> result=getUniqueElements(first,second);
        System.out.println(result);

    }

    public static ArrayList<Integer> getUniqueElements(int[] first, int[] second) {

        ArrayList<Integer>result=new ArrayList<>();
    

        for (int i : first) {
            if (!result.contains(i))
           result.add(i);
        }

        for (int i : second) {
            if (!result.contains(i))//I am checking my each element from second then I am putting in my result it is not in the result
                result.add(i);
        }
        

        return result;

    }
}


/*
Task 3 :

Create a method that get two arrays as a parameters then return the arraylist which has contains unique elements in it.

first array :1,2,3,4,5

second array :4,5,6

output:

1,2,3,4,5,6
 */