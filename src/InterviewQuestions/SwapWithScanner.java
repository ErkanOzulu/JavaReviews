package InterviewQuestions;

import java.util.Scanner;

public class SwapWithScanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter first number : ");
        int firstNum=scan.nextInt();
        System.out.print("Please enter second number : ");
        int secondNum=scan.nextInt();

        System.out.println("Before swap first number = " + firstNum + " second number = " + secondNum);
        int dummy=firstNum;
        firstNum=secondNum;
        secondNum=dummy;
        System.out.println("After swap first number = " + firstNum + " second number = " + secondNum);

    }

}
