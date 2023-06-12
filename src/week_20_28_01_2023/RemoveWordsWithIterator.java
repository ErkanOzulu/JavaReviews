package week_20_28_01_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveWordsWithIterator {
    public static void main(String[] args) {

        // List<String> words = List.of("apple","banana","chery","Cydeo");//with plugin I added "tabnine"

        List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "cydeo", "dog"));

        //I want to remove the word which is starting with a


        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.startsWith("a")) {
                iterator.remove();
            }
        }
        System.out.println(words);
        //remove the word which has more than 5 letters
        Iterator<String> iterator1 = words.iterator();
      while (iterator1.hasNext()){
          String word = iterator1.next();
          if (word.length() > 5) {
              iterator1.remove();
          }
      }
      System.out.println(words);
    }


    }

