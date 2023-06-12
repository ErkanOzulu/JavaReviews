package week16_24_12_2022.exceptions;

public class CompileTimeExceptionsExample {
    public static void main(String[] args) {

        System.out.println("Adam");
        waitFor(3);
        System.out.println("ersin");

    }

    private static void waitFor(int seconds) {

        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
