package week08_29_10_2022;

public class T4_MyS {
    public static void main(String[] args) {

        String[] arr={"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};

        String result="";
        int max=0;

        for (String each : arr) {
            String reverse="";

            for (int i = each.length()-1; i >=0 ; i--) {
                reverse+=each.charAt(i);
            }
            if (reverse.equals(each)&&reverse.length()>max){
            max=reverse.length();
            result=reverse;
        }


    }
        System.out.println(result);
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