package week12_26_11_2022.Static;

public class EatCake {

    public static int totalSlice=10;



    public void eatCake(int eatSlice){
        totalSlice-=eatSlice;
        System.out.println("Remaining slices: "+totalSlice);
    }




}
