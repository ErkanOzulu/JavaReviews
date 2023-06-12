package week17_07_01_2023.exception;

public class DisAdvantageOfThrows {
    public static void main(String[] args) throws InterruptedException {
        waitFor(3);
        
        sleep(4);
        
    }
    public  static void sleep(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void methodB(){
        sleep(4);
    }

    public static void waitFor(int seconds) throws InterruptedException {

        sleep(seconds*1000);
    }

    public static void methodA() throws InterruptedException {
        waitFor(4);

    }


}
