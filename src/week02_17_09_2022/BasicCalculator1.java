package week02_17_09_2022;

public class BasicCalculator1 {

    public static void main(String[] args) {

        /*
        3. Create a class named BasicCalculator. write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
         */

        double firstNumber,num2;
        firstNumber =25;
        num2=5;



        double sum= firstNumber +num2;
        double subtract= firstNumber -num2;
        double multiply= firstNumber *num2;
        double divide= firstNumber /num2;
        double reminder= firstNumber % num2;

        System.out.println("sum = " + sum);
        System.out.println("subtract = " + subtract);
        System.out.println("multiply = " + multiply);
        System.out.println("divide = " + divide);
        System.out.println("reminder = " + reminder);



    }

}
