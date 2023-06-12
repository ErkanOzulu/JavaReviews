package InterviewQuestions;


public class W1 {
    public static void main(String[] args) {
        identify(5);

        System.out.println("----------------------------");

        divideWithoutOperator(6, 2);

        divisionWithoutOperator(-7,2);

        System.out.println("----------------------------");

        printOut(30);
        System.out.println();

        System.out.println("----------------------------");

        finra();

    }

    public static void finra() {
        for (int i = 1; i <= 30; i++) {

                if (i%5==0&&i%3==0) {
                    System.out.print("FINRA");
                } else  if (i%5==0){
                    System.out.print("RA");
                } else if (i%3==0){
                    System.out.print("FIN");
                }else {
                    System.out.print(i);
                }
            
        }
    }


    public static void divideWithoutOperator(int a, int b) {
        if (b == 0) {

            System.out.println(b + " is a Invalid denominator ");
            return;
        }
        System.out.print(a + " divided by " + b + " is: ");
        int count = 0;
        while (a >= b) {
            a -= b;
            count++;
        }
        System.out.println(count + " remainder is " + a);

    }
    public static int divisionWithoutOperator(int num1,int num2){
        int count=0;
        int a=1;

        if((num1<0 && num2>0)){
            num1=-num1;
            a=-1;
        }else if(num1>0 && num2<0){
            num2=-num2;
            a=-1;
        } else if (num1<0 && num2<0) {
            num1=-num1;
            num2=-num2;
        } else if (num2 ==0) {
            System.out.println("You can not divide by zero!!!");
        }

        while (num1 >= num2){
            num1=  num1-num2;
            count++;
        }
        return a*count;
    }

    private static void identify(int i) {

        if (i % 2 == 0) {
            System.out.println(i + " is a even number. ");
        } else {
            System.out.println(i + " is a odd number. ");
        }
    }

            /*
         FINRA :
         Write a method which prints out the numbers from 1 to 30 but for numbers which
         are a multiple of 3print "FIN" instead of the number and for numbers which are a
         multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
         both 3 and 5, print "FINRA" instead of the number
          */
    private static void printOut(int i) {
        for (int a = 1; a <=i ; a++) {

            if (a%5==0&&a%3==0) {
                System.out.print("FINRA");
            } else  if (a%5==0){
                System.out.print("RA");
            } else if (a%3==0){
            System.out.print("FIN");
            }else {
                System.out.print(a);
            }


        }
    }

}
