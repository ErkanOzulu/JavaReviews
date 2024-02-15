package InterviewQuestions;

import java.util.*;

public class Q4 {
    public static void main(String[] args) {

        String input = "gffg";
        int count = countDistinctSubstrins(input);
        System.out.println(count);

    }

    private static int countDistinctSubstrins(String input) {

        input.substring(0,1);
        input.substring(0,2);
        input.substring(0,3);
        input.substring(0,4);
        input.substring(1,2);
        input.substring(1,3);
        input.substring(1,4);

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {

            for (int j = i+1; j <=input.length() ; j++) {
                String sub = input.substring(i, j);
               boolean valid= checkWord(sub);
               if (valid) result.add(sub);

            }
        }


        return result.size();
    }

    private static boolean checkWord(String sub) {
        String[] chars = sub.split("");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(chars));
        Set<String>set=new HashSet<>(list);

        return list.size()==set.size();
    }

    private static boolean checkWord2(String sub) {
        boolean isValid=true;
        String[] chars = sub.split("");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(chars));

        for (String s : list) {
            if (Collections.frequency(list,s)>1){
                isValid=false;
                break;
            }
        }


        return isValid ;
    }

    /*
"Count of substrings having all distinct characters
Given a string str consisting of lowercase alphabets, the task is to find the number of possible substrings (not necessarily distinct) that consists of distinct characters only.
Examples:
Input: Str = “gffg”
Output: 6
Explanation:
All possible substrings from the given string are,
( “g“, “gf“, “gff”, “gffg”, “f“, “ff”, “ffg”, “f“, “fg“, “g” )
Among them, the highlighted ones ( “g“, “gf“, “f“, “f“, “fg“, “g” ) consists of distinct characters only.
Input: str = “gfg”
Output: 5
Explanation:
All possible substrings from the given string are,
( “g“, “gf“, “gfg”, “f“, “fg“, “g” )
Among them, the highlighted ( “g“, “gf“, “f“, “fg“, “g” ) consists of distinct characters only. "
 */

}
