package week_19_21_01_2023;

import com.sun.source.tree.Scope;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {

        BalancedBracket("{[()]}");

    }

    private static void BalancedBracket(String bracket) {

        List<String> list = new ArrayList<>(Arrays.asList(bracket.split("")));
        Queue<String> brackets1 = new ArrayDeque<>(list);//preserve the insertion order and has FIFO
        Stack<String> brackets2 = new Stack<>();//preserve the insertion order and has LIFO
        brackets2.addAll(list);
        if (list.size()%2!=0){
            System.out.println("Not balanced");
            System.exit(0);
        }

        for (int i = 0; i < list.size() / 2; i++) {

            String a = brackets1.peek(); //gets first element because of FIFO
            String b = brackets2.peek();//gets last element because of LIFO

            brackets1.poll();//removes  first element for each loop
            brackets2.pop();// removes last element for each loop


            if (a .equals("{")  && b.equals("}") || a .equals("(")  && b.equals(")") || a .equals("[")  && b.equals("]")) {

                continue;

            } else {
                System.out.println("Not balanced");
                return;
            }

        }

        System.out.println("Balanced");

    }

}

/*
 For compiler one of the most important task is balanced brackets
            * Create a method that will accept a String of brackets. Determine if the brackets are balanced.
            Brackets are balanced if the closing bracket matches the opening one.

            Ex: {([])} -> balanced
                {[(])} -> not balanced

 */
