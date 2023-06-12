package week07_22_10_2022;

public class OneLoopStars {
    public static void main(String[] args) {

        for (int i = 1; i < 29; i++) {

            System.out.print("*");
            if (i % 7 == 0){
                System.out.println();
            }


        }
    }
}
