package week03_24_09_2022;

public class EligibleToBuyCigarettes {
    public static void main(String[] args) {
        byte age=17;
        String result="";

        if (age>=18){

            result ="Eligible";
        }else {
            result ="not eligible";
        }

        System.out.println("("+age+")"+"Your age  is "+result+" to buy cigarettes.");


        System.out.println("---------Second way----------------");
        byte age1 = 21;

        boolean eligible = age1 >= 21;

        if(eligible){
            System.out.println("Eligible to buy ");
        }

        if(!eligible){
            System.out.println("Not eligible to buy ");
        }



    }


}
/*
1. Given a number (byte) age, write a program that can check if the
person is eligible to buy Cigarettes

 */