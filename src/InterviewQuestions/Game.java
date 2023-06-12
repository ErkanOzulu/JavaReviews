package InterviewQuestions;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        System.out.println("Welcome to the Game");

        System.out.println("What is your name: ");
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        System.out.println("Hello " + name);
        System.out.println(name + ", Shall we start the game?");

        String yesOrNo = scan.next();

        if (!(yesOrNo.equalsIgnoreCase("yes"))) {
            return;
        }

        Random random = new Random();
        int rand = random.nextInt(100);//0-99

        for (int i = 0; i < 5; i++) {


            System.out.println("What is your guess? (0-99)");
            int guess = scan.nextInt();
            if (rand == guess) {
                System.out.println("Congratulation!!!");
                break;
            } else if (i != 4 && rand > guess) {
                System.out.println("please guess higher ");

            } else if (i != 4 && rand < guess) {
                System.out.println("please guess lower ");
            } else {
                System.out.println("Sorry, you failed 5 times.\n" + "Game over");
                System.exit(0);
            }
        }
    }
}
/*
 * We are going to make a GAME!
 * The concept is: Generate a random number and ask the user to quess the number,
 * continue asking until you receive the number
 * after 5 times of quessing show a game over message
 *
 * Here is how it works:
 * Show a welcome message
 * Ask the User's name and say hello to thd user
 * Ask if we should start the game
 * After receiving a positive answer generate a random number and ask for the user's quess
 * If the quess is correct show a congratulation message and quit the game
 * If the number is not correct, ask again until you receive the correct answer
 * As a hint, beside the first time, every time that you are asking for a number, tell the user to guess higher or lower
 * If the User failed 5 times, show a game over message and quit the game
 */