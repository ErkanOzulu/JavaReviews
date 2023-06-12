package week17_07_01_2023.exception;

public class CustomArithmeticException extends RuntimeException{

    //for mac command+N
    //for windows alt+insert


    public CustomArithmeticException() {
        super("You have an error with divide with 0");
    }
    public CustomArithmeticException(String message) {
        super(message);
    }
}
