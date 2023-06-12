package week05_08_10_2022;

public class Replace {
    public static void main(String[] args) {

        String sentence3="Java is a hard language";

        System.out.println(sentence3.replace("hard", "easy"));
        System.out.println(sentence3.replace("hard", "fun"));


        String sentence4="Java is not same with java";
        System.out.println(sentence4.replaceFirst("java", "c#"));

    }
}
