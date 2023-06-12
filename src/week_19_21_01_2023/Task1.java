package week_19_21_01_2023;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {


        List<Integer> numbers=new ArrayList<>(Arrays.asList(24,1,2,3,3,9,24,3,4,3,5,3,5,3));


        Set<Integer> set = new HashSet<>(numbers);
        System.out.println(set);


        set=new TreeSet<>(numbers); //sorted order
        System.out.println(set);

        set = new LinkedHashSet<>(numbers);//keeps the order
        System.out.println(set);

    }


}
/*
/*
 List<Integer> numbers=new ArrayList<>(Arrays.asList(24,1,2,3,3,9,24,3,4,3,5,3,5,3));

 - get the unique numbers(one of them) from list
 [24, 1, 2, 3, 9, 4, 5]
 */
