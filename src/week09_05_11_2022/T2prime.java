package week09_05_11_2022;

public class T2prime {
    public static void main(String[] args) {


        boolean result=isPrime(2);
        System.out.println(result);
    }

    public static boolean isPrime(int num) {
        boolean isPrimeNumber=true;

        for (int i = 2; i <num ; i++) {
            if(num%i==0){
                isPrimeNumber=false;
                break;
            }

        }
        return isPrimeNumber;
    }


}
/*
Task 2 :   Write a method that can check if a number is prime or not

                Note : Prime numbers are special numbers, greater than 1, that have exactly two factors, themselves and 1
 */