package week_20_28_01_2023.functionalInterface;

public class TestFunction {

    public static void main(String[] args) {

        MyFuncInterface reverseWord=(n)->{
           return new StringBuilder(n).reverse().toString();
        };

        System.out.println(reverseWord.test("red"));

        MyFuncInterface initial=n-> n.substring(0,2) ;

        System.out.println(initial.test("ADam"));



    }




    public static String reverse(String str){

        return new StringBuilder(str).reverse().toString();
    }


}
