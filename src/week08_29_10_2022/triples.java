package week08_29_10_2022;
import java.util.Scanner;
public class triples {
    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        //WRITE YOUR CODE BELOW
        int control = 0;

        for(int i = 0; i < str.length()-2; i++){

            if(str.charAt(i)==str.charAt(i+1)){

                if(str.charAt(i+1)==str.charAt(i+2)){
                    control++;
                }

            }

        }

        System.out.println(control);


        System.out.println("--other solution---");
        int total=0;
        for (int i = 0; i <= str.length() - 3; i++) {
            char ch =str.charAt(i);

            String str1 = str.substring(i, i + 3);
            int count =0;
            for (int j = 0; j <3; j++) {

                if (str1.contains(""+ch)) {
                    count++;
                    str1 = str1.replaceFirst(""+ch, "");
                }
                if (count==3) {
                    total++;
                }


            }
        }
        System.out.println(total);

    }
}
