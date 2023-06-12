package week17_07_01_2023.exception;

public class CustomExceptionExample {
    public static void main(String[] args) {

//ArithmeticException

        try {
            System.out.println(3 / 8);
        } catch (Exception e) {
            //throw new CustomArithmeticException();
            throw new CustomArithmeticException("you have an error");
        }


    }


}
