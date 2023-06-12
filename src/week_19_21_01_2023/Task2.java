package week_19_21_01_2023;

import java.util.*;

public class Task2 {

    public static void main(String[] args) {

        List<String>list=new ArrayList<>();

        list.addAll(Arrays.asList("ahmet","rafet","mehmet","saffet","temel"));
        System.out.println("unsorted list = " + list);


       System.out.println(sort1(list));

        List<String> result=  sortedNames(list);
        System.out.println("sorted list = "+result);


    }


    //First way
    private static List<String> sort1(List<String> list) {

        Collections.sort(list);
        return list;

    }

    //second way
    private static List<String> sortedNames(List<String> list) {

        Set<String> set=new TreeSet<>(list);

        return new ArrayList<>(set); // new ArrayList<>(new TreeSet<>(list););
    }





}
  /*

  --    create a list put the names
         ahmet
         rafet
         mehmet
         saffet
         temel
     -- create a method and return the sorted list
      ahmet ,mehmet,rafet,saffet,temel
     */
