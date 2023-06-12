package week07_22_10_2022;

public class Reverse4 { //with for each
    public static void main(String[] args) {
        String[] str = {"Adam", "come", "here"};

        for (String s : str) {

            String result = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                result += s.charAt(i);

            }

            System.out.print(result + " ");

        }
    }
}
