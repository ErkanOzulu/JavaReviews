package week_20_28_01_2023.enums;

public class TestEnum {
    public static void main(String[] args) {

      /*  String day="Monday";

        switch (day){

            case "Monday":
                System.out.println("Monday");
                break;

            case "Tuesday":
                System.out.println("Tuesday");
                break;

            case "Wednesday":
                System.out.println("Wednesday");
                break;


          }
       */

        //ContentType.JSON
        Day day=Day.Friday;

        switch (day){

            case Wednesday:
                System.out.println("Today is "+day);
                break;

            case Thursday:
                System.out.println("Today is "+day);
                break;

            case Friday:



        }

    }
}
