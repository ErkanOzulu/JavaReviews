package InterviewQuestions;

public class Q5_PrimeNumber {
    public static void main(String[] args) {

        Boolean result = isPrime(5);
        System.out.println(result);
    }

    private static boolean isPrime(int number) {

        if (number<2)
            return false;

        boolean isPrime=true;

        for (int i = 2; i <=number/2 ; i++) {

            if (number%i==0){
                isPrime=false;
                break;
            }
        }

        return isPrime;

    }


}
/*
create a method that check if a number is prime or not. Prime number means it is only divisible by 1 and itself
input: 2
output: true
input: 1
output: false
input: 8
output: true

 */