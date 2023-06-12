package week07_22_10_2022;

public class rev {
    public static void main(String[] args) {
        String str = "Adam come here";
        String str2="";

        for (int i = str.length()-1; i >=0 ; i--) {
            char ch=str.charAt(i);
            str2+=ch;
        }

        System.out.println(str2);
    }
}
