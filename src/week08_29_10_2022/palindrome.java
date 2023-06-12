package week08_29_10_2022;

public class palindrome {
    public static void main(String[] args) {
        String[] arr = {"java","longer word","civic","apple","racecar","mom","anna"};

        String result = "";

        int count = 0;

        for (String each : arr) {

            String temp = "";

            for (int i = each.length()-1; i >= 0 ; i--) {

                temp += each.charAt(i);

            }

            if(temp.equals(each) && temp.length() > result.length()) {
                result = temp;
                count++;
            }

        }

        if(count == 0)
            System.out.println("No Palindrome");
        else
            System.out.println(result);
    }
}
