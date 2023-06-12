package week07_22_10_2022;

public class Reverse {
    public static void main(String[] args) {

        String str = "Adam come here";
        String temp = "";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                temp += ch;
                continue;
            }
            for (int j = temp.length() - 1; j >= 0; j--) {

                result += temp.charAt(j);

            }

            result += " ";
            temp = "";
        }

        for (int j = temp.length() - 1; j >= 0; j--) {

            result += temp.charAt(j);

        }


        System.out.println(result);



        }
    }


