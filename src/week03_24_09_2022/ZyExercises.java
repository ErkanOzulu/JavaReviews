package week03_24_09_2022;

public class ZyExercises {
    public static void main(String[] args) {


        int x = 4;

        int y = x * 4 - x++;


        System.out.println(y);//

        System.out.println(x);//
//===============================================

        int i = 11, j = 4;

        int res = i++ + --j;


        System.out.println("res = " + res);//
//==============================================

        int a =10;

        int result = --a + a++ + a--+ a++  ;




        System.out.println("a = " + a);//
        System.out.println("res = " + result);//


//============================================

        int av = 100;

        av -= 20 * 2;

        System.out.println("av = " + av);//

//===========================================


        int x1 = 1;

        System.out.println( (x1 > 4) && (++x1 == 4) ) ;  //
        System.out.println( x1 );  //


        System.out.println( (x1 > 4) & (++x1 == 4) );   //
        System.out.println( x1 ); //

//============================================

        int x2 = 1;

        System.out.println( (x2 > 0) || (++x2 == 4) );   //
        System.out.println( x2 ); //


        System.out.println( (x2 > 0) | (++x2 == 4) );    //
        System.out.println( x2 );  //



    }
}
