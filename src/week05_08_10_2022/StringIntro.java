package week05_08_10_2022;

public class StringIntro {
    public static void main(String[] args) {

        // we can create String two different ways
        //1.String literal
        String str="Kazım";
        String str1="Kazım";
        System.out.println(str == str1);
        // 2 new keyword
        String str2=new String("Kazım");
        String str3=new String("Kazım");
        System.out.println(str1==str2);
        System.out.println(str2 == str3);


    }
}
