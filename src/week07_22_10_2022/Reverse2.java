package week07_22_10_2022;

public class Reverse2 {
    public static void main(String[] args) {

        System.out.println("------------------second way--------------------------------");


        String str = "Adam come here";

        String result2 = "";

        for (int i = 0; i < str.length(); i++) {


            if (str.charAt(i) == ' ') {

                for (int j = i - 1; j >= 0; j--) {

                    result2 += str.charAt(j);
                }
                result2 += " ";
                str = str.substring(i + 1);
                i = 0;
            }

            if (i == str.length() - 1) {
                for (int j = i; j >= 0; j--) {
                    result2 += str.charAt(j);
                }
                System.out.println(result2);
                System.exit(0);
            }

        }
    }
}

