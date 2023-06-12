package week08_29_10_2022;

public class T4_ {
    public static void main(String[] args) {

        String words[] = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        int max = words[0].length();
        String longest = "";
        for (String word : words) {
            String reverse = "";
            for (int i = word.length()-1; i >= 0 ; i--) {
                reverse += word.charAt(i);
            }
            if (word.equals(reverse)){
                if (max < word.length()){
                    longest = reverse;
                }
            }

        }
        System.out.println(longest);
    }
}




/*
Task 4 :  For Each - Nested For

            Longest Palindrome

                Given a String array. Find the longest Palindrome String in your array.
                    Ex:
                    Input: ["java", "longer word", "civic" "apple", "racecar", "mom", "anna"] Output: racecar
                    Ex:
                    Input: ["abc", "dna", "kevin", "joe", "lamp"]
                    Output: No palindrome
 */