package InterviewQuestions;

import com.sun.jdi.Value;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number : ");

        int num=0;
         if (scan.hasNextInt()) {
            num = scan.nextInt();
            System.out.println("number : " + num);
        } else {
            System.out.println("Invalid input");
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;

        }
        System.out.println("factorial " + num + " = " + factorial);


        //factorial with while
        factorial = 1;
        while (num > 0) {
            factorial *= num;
            num--;
        }
        System.out.println("factorial with while = " + factorial);

        //sum of digits of a number

        int a = 1233;
        int sum = 0;
        String b = String.valueOf(a);
        String[] split = b.split("");
        for (String s : split) {
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);

        System.out.println("------- with do while loop -------");
        sum = 0;
        do {
            sum += a % 10;
            a /= 10;
        } while (a > 0);
        System.out.println("sum of digits = " + sum);


    }

}
