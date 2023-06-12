package InterviewQuestions;

public class W2 {

    public static void main(String[] args) {

        //Swap Number
        //Swap to variable' values without using third variable


        swap(3, 5);
        divisible();


    }

    private static void swap(int a, int b) {

        a = a + b;
        b = a - b;
        a = a - b;
//        a = a^b;  //TODO what is ^
//        b = a^b;
//        a = a^b;

        System.out.println("a: " + a + ", b: " + b);

    }


    //Numbers -- Divisible by 3, 5, 15
    public static void divisible() {

        String divisibelBy15 = "";
        String divisibleBy3 = "";
        String divisibleBy5 = "";
        String num="";
        String s="";

        for (int a = 0; a <= 100; a++) {
           s= (a % 15 == 0) ? divisibelBy15 += a : (a % 5 == 0) ? divisibleBy5 += a : (a % 3 == 0) ? divisibleBy3 += a :num;


        }
        System.out.println("s = " + s);
        System.out.println("num = " + num);
        System.out.println("divisibelBy15 = " + divisibelBy15);
        System.out.println("divisibleBy5 = " + divisibleBy5);
        System.out.println("divisibleBy3 = " + divisibleBy3);
    }


}
