package InterviewQuestions;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("****************************************");
        int a,b;
        System.out.println("1.adding\n"+"2.subtraction\n"+"3.multiplicaiton\n"+"4.dividing");
        System.out.println("****************************************");
        System.out.print("Please enter operation type : ");
        Scanner scan=new Scanner(System.in);

        int operation=scan.nextInt();

        switch (operation){
            case 1:
                System.out.print("please enter first number : ");
                a = scan.nextInt();
                System.out.print("please enter second number : ");
                b=scan.nextInt();
                System.out.println(a+b);
                break;
            case 2:
                System.out.print("please enter first number : ");
                a = scan.nextInt();
                System.out.print("please enter second number : ");
                b=scan.nextInt();
                System.out.println(a-b);
                break;
            case 3:
                System.out.print("please enter first number : ");
                a = scan.nextInt();
                System.out.print("please enter second number : ");
                b=scan.nextInt();
                System.out.println(a*b);
                break;
            case 4:
                System.out.print("please enter first number : ");
                a = scan.nextInt();
                System.out.print("please enter second number : ");
                b=scan.nextInt();
                System.out.println((double)a/b);
                break;
            default:
                System.out.println("Invalid operation");

        }



    }
}
