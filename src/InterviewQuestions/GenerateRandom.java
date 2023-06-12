package InterviewQuestions;

import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandom {
    public static void main(String[] args) {


/**
     Method 1: Using random class
 */


            // Instance of random class
            Random rand = new Random();
            // Setting the upper bound to generate the
            // random numbers in specific range
            int upperbound = 25;
            // Generating random values from 0 - 24
            // using nextInt()
            int int_random = rand.nextInt(upperbound);
            // Generating random using nextDouble
            // in 0.0 and 1.0 range
            double double_random = rand.nextDouble();
            // Generating random using nextDouble
            // in 0.0 and 1.0 range
            float float_random = rand.nextFloat();

            // Printing the generated random numbers
            System.out.println("Random integer value from 0 to " + (upperbound-1) + " : " + int_random);
            System.out.println("Random float value between 0.0 and 1.0 : " + float_random);
            System.out.println("Random double value between 0.0 and 1.0 : " + double_random);

/**
Method 2: Using Math.random
For generating random numbers within a range using Math.random(), follow the steps below:

Declare the minimum value of the range
Declare the maximum value of the range
Use the formula Math.floor(Math.random() *(max - min + 1) + min) to generate values with the min and the max value inclusive.
Note: This method can only be used if you need an integer or float random value.
 */
        int min = 50; // Minimum value of range
        int max = 100; // Maximum value of range
        // Print the min and max
        System.out.println("Random value in int from "+ min + " to " + max + ":");
        // Generate random int value from min to max
        //formula Math.floor(Math.random() *(max - min + 1) + min)
        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
        // Printing the generated random numbers
        System.out.println(random_int);


        /**
        Method 3: Using ThreadLocalRandom
To generate random numbers using the class ThreadLocalRandom, follow the steps below:

Import the class java.util.concurrent.ThreadLocalRandom
Call the method
To generate random number of type int ThreadLocalRandom.current().nextInt()
To generate random number of type double ThreadLocalRandom.current().nextDouble()
To generate random number of type boolean ThreadLocalRandom.current().nextBoolean()
         */

        // Generate random integers
        int int_random2 = ThreadLocalRandom.current().nextInt();

        // Print random integers
        System.out.println("Random Integers: " + int_random);

        // Generate Random doubles
        double double_rand = ThreadLocalRandom.current().nextDouble();

        // Print random doubles
        System.out.println("Random Doubles: " + double_rand);

        // Generate random booleans
        boolean boolean_rand = ThreadLocalRandom.current().nextBoolean();

        // Print random booleans
        System.out.println("Random Booleans: " + boolean_rand);


/**
 Method 4: Using SecureRandom
 Random class has a higher chance of repeating numbers during random number generation. Whereas, SecureRandom class allows us to generate cryptographically strong random numbers using the following steps:

 Import the SecureRandom using java.security.SecureRandom.
 Make the instance of SecureRandom class using new SecureRandom().
 Use following methods to generate the random numbers:
 nextInt(upperbound) generates random numbers in the range 0 to upperbound-1.
 nextFloat() generates a float between 0.0 and 1.0.
 nextDouble() generates a double between 0.0 and 1.0.
 */
        // Instance of SecureRandom class
        SecureRandom ran = new SecureRandom();
        // Setting the upper bound to generate
        // the random numbers between the specific range
        int upperbound1 = 1000;
        // Generating random values from 0 - 999
        // using nextInt()
        int int_ran1 = rand.nextInt(upperbound1);
        int int_ran2 = rand.nextInt(upperbound1);
        // Generating random using nextDouble
        // in 0.0 and 1.0 range
        double double_ran = rand.nextDouble();
        // Generating random using nextDouble
        // in 0.0 and 1.0 range
        float float_ran= rand.nextFloat();

        // Printing the generated random numbers
        System.out.println("Random integer value from 0 to " + (upperbound1 - 1) + " : " + int_ran1);
        System.out.println("Random integer value from 0 to " + (upperbound1 - 1) + " : " + int_ran2);
        System.out.println("Random float value between 0.0 and 1.0 : " + float_random);
        System.out.println("Random double value between 0.0 and 1.0 : " + double_random);





    }


    }

