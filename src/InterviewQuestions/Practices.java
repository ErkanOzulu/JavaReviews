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
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a number");
        if (scan.hasNextInt()) {//checks if the number is an int
            int num = scan.nextInt();
            int dumy = num;
            int l = Integer.toString(dumy).length();
            int sum = 0;

            while (dumy > 0) {
                int a = dumy % 10;
                dumy /= 10;
                sum += (int) Math.pow(a, l);
            }

            if (num == sum) {
                System.out.println(num + " is a armstrong number.");
            } else {
                System.out.println(num + " is not a armstrong number");
            }

        } else {
            System.out.println("Invalid input");
        }
        scan.nextLine();

        System.out.println("---------- multiplication table ----------");

        //the multiplication table


        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i+" * "+j+" = "+(i*j));
            }
        }

        System.out.println("---------- user login  ----------");
        //Try to write a user login with the help of a while loop.

        String sys_username="Ahmet Mustafa";
        String sys_password= "123ass";

        int entryOfNum=3;

        while (entryOfNum>0) {

            System.out.print("Please enter your name : ");
            String username = scan.nextLine();
            System.out.print("Please enter your password : ");
            String password=scan.nextLine();

            if (username.equals(sys_username)&&password.equals(sys_password)){
                System.out.println("Welcome "+username);
            } else if (username.equals(sys_username)&&!password.equals(sys_password)) {
                System.out.println("Your password is not correct, please try again");
                entryOfNum-=1;
                System.out.println("Your right of entries : "+entryOfNum);
            } else if (!username.equals(sys_username)&&password.equals(sys_password)) {
                System.out.println("Your username is not correct, please try again");
                entryOfNum-=1;
                System.out.println("Your right of entries : "+entryOfNum);
            } else {
                System.out.println("Your password and username is not correct, please try again");
                entryOfNum-=1;
                System.out.println("Your right of entries : "+entryOfNum);
            }

            if (entryOfNum==0){
                System.out.println("Your right of entries is finished.We are waiting for you again");
            }
        }


    }
}
