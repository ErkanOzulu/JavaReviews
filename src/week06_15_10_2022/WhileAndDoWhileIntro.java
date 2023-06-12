package week06_15_10_2022;

public class WhileAndDoWhileIntro {
    public static void main(String[] args) {

        //Syntax of while
        boolean flag=true;

        int i=0;
        // print the numbers till 100
        while (flag){ // if flag is false exit the loop
            System.out.println(i++);

            if (i==100) // exit condition
                flag =false;
        }
do {
    //statements
}while (flag);


    }
}
