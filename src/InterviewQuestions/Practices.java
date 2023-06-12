package InterviewQuestions;

import java.util.Scanner;

public class Practices {
    public static void main(String[] args) {
        /*
        Try to find out if a number entered is the armstrong number.
         For example, for a 4-digit number to be an Armstrong number, it must meet the following condition.
         1634 = 1^4 + 6^4 + 3^4 + 4^4 (4 digits here)
         371 = 3^3 + 7^3 + 1^3 (number of 3 digits here)

         You can do this program with the help of do while loop.
         */
        Scanner scan=new Scanner(System.in);

        System.out.print("Please enter a number");
        if (scan.hasNextInt()){//checks if the number is an int
            int num = scan.nextInt();

            if (armstrongnumber(num)) {
                System.out.println(num+" is a armstrong number.");
            } else {
                System.out.println(num + " is not a armstrong number");
            }
        }else {
            System.out.println("Invalid input");
        }


    }

    private static boolean armstrongnumber(int num) {

        int dumy=num;
        int l= Integer.toString(dumy).length();
        int sum=0;
        while (dumy>0){
            int a=dumy%10;
            dumy/=10;
            sum+= (int) Math.pow(a,l);
        }

       return  (sum==num)?true:false;

    }
}
