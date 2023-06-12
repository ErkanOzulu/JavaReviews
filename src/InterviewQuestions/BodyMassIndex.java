package InterviewQuestions;

import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {

        /*
        BMI= weight/(length*length);
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your weight :");

        double w = scan.nextDouble();
        System.out.print("Please enter your length :");
        double l = scan.nextDouble();
        double BMI = w / (l * l);
        System.out.println("Your BMI : " + BMI);

        if (BMI<18.5){
            System.out.println("weak");
        } else if (BMI>=18.5&&BMI<25) {
            System.out.println("normal");
        } else if (BMI>=25 && BMI<30) {
            System.out.println("overweight");

        }else {
            System.out.println("obez");
        }

        //findHinTriangle


        int a, b;

        System.out.println("Please enter a = ");

        a = scan.nextInt();

        System.out.println("Please enter b = ");

        b = scan.nextInt();

        double h = Math.sqrt(a * a + b * b);

        System.out.println("Hipotenus = " + h);



    }


}
