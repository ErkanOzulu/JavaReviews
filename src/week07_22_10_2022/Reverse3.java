package week07_22_10_2022;

public class Reverse3 {
    public static void main(String[] args) {

        String str = "Adam come here";
        String result = "";

        while(str.contains(" ")) {

            for (int i = str.indexOf(" ") - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            result += " ";
            str = str.substring(str.indexOf(" ") + 1);
        }
        if (!(str.contains(" "))){
            for (int i = str.length()-1; i >=0 ; i--) {
                result += str.charAt(i);
            }
        }

        System.out.println(result);


    }
}
