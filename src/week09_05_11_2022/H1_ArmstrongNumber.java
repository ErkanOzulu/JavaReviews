package week09_05_11_2022;

public abstract class H1_ArmstrongNumber {
    public static void main(String[] args) {

        armstrongNumber(1007);

System.exit(0);
    }

    private static void armstrongNumber(int num) {


        String a = "" + num;
        int result = 0;
        String[] digit = a.split("");

        for (int i = 0; i < digit.length; i++) {
            result+= Math.pow(Character.getNumericValue(a.charAt(i)),3);
            //Math.pow===>>to multiply three times
            //Character.getNumericValue(a.charAt(i))==> to change a character digit to int value
        }
        if (result==num)
            System.out.println(num+" is an armstrong number.");
        else
            System.out.println(num+" is not an armstrong number.");
/*
second way
   int result = (int) (Math.pow(number%10,3)+Math.pow((int)(number/10)%10,3)+Math.pow((number/100),3));
        if (number== result){
            System.out.println(number + " is an armstrong number.");
        }else {
            System.out.println(number + " is not an armstrong number.");
        }


 3.way
     boolean isArmstrong = true;
        int firstDigit = num / 100 ;
        int secondDigit = (num % 100) / 10;
        int thirdDigit = (num % 100) % 10;
 */

    }

}
/*
Task 3 :   Write a method that can check if a number is Armstrong number

                Note: if I have a 3-digit number then each of the digits is raised to the power of three and added to obtain a number. If the number obtained equals the original number then, we call that armstrong number.

                Armstrong numbers are     === 153 370 371 407 ===

  Tüm basamaklarındaki rakamların sayı değerlerinin küpleri toplamı,kendisine eşit olan sayılara "Armstrong sayı"denir.

Örneğin; 371=33+73+13=27+343+1=371
 */