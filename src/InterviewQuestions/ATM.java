package InterviewQuestions;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        /*
        Transactions
         1. Transaction: Balance Learning
         2. Transaction: Withdrawal
         3. Transaction: Deposit
         Exit : q
         */
        System.out.println("**********************************");

        System.out.println(" Transactions\n" +
                "         1. Transaction: Balance Learning\n" +
                "         2. Transaction: Withdrawal\n" +
                "         3. Transaction: Deposit\n" +
                "         Exit : q");

        System.out.println("**********************************");
        double balance=1000;
        while (true){
            Scanner scan=new Scanner(System.in);
            System.out.print("Please enter a transaction : ");
           String t = scan.nextLine();

            if (t.equals("1")){
                System.out.println("Your balance is " + balance);

            } else if (t.equals("2")) {
                System.out.print("Please enter amount to withdraw :");
                int w = scan.nextInt();

                if (balance-w<0) {
                    System.out.println("You don't have enough balance.Your balance :" +balance);
                } else {
                    balance-=w;
                    System.out.println("Your balance is " + balance);

                }
                scan.nextLine();

            } else if (t.equals("3")) {
                System.out.print("Please enter the amount to deposit :");
                int deposit = scan.nextInt();
                balance+=deposit;
                System.out.println("Your balance is " + balance);
                scan.nextLine();

            } else if (t.equals("q")) {
                System.out.println("Exiting from application...");
                break;
            }else {
                System.out.println("Invalid choice");
            }


        }



    }
}
