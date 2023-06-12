package week09_05_11_2022;

public class H3_isIn1020 {
    public static void main(String[] args) {

       boolean result= isIn1020(3,10);
        System.out.println(result);
    }

    private static boolean isIn1020(int num1, int num2) {
        boolean result=false;

        if (num1>=10&&num1<=20 || num2>=10&&num2<=20)
            result=true;
        else
            result=false;

        return result;

    }


}
/*
Task 7 : Write a method that given 2 int values, return true if either of them is in the range 10..20 inclusive.
            multiple parameter  --- takes two integers
            return type --- boolean

             in1020(12, 99) → true
             in1020(21, 12) → true
             in1020(8, 99) → false

 */