package week02_17_09_2022;

public class BasicCalculator2 {
   /*
    3. Create a class named BasicCalculator. write a Java program to print the sum (addition), multiply, subtract,
    divide and remainder of two numbers.
     */

    public static void main(String[] args) {

        int a = 80;
        int b = 7;

        int sum = a + b;
        int multiply = a * b;
        double divide = (double) a / b;
        int remainder = a % b;

        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " x " + b + " = " + multiply);
        System.out.println(a + " / " + b + " = " + divide);
        System.out.println(a + " % " + b + " = " + remainder);


    }
}
/*
  int a = 20;
        int b = 10;

        System.out.println("addition=" + (a+b));
        System.out.println("multiply="+ (a*b));
        System.out.println("substract="+ (a-b));
        System.out.println("divider=" + (a/b));
 --------------------------------------------------------------
int numberOne = 20;
    int numberTwo = 5;
    int addition = numberOne + numberTwo;
    int multiplication = numberOne * numberTwo;
    int subtraction = numberOne - numberTwo;
    int division = numberOne / numberTwo;

        System.out.println("addition = " + addition);
        System.out.println("multiplication = " + multiplication);
        System.out.println("subtraction = " + subtraction);
        System.out.println("division = " + division);



 */