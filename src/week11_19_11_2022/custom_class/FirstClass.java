package week11_19_11_2022.custom_class;

import java.util.ArrayList;

public class FirstClass {
public int a;
public  String b;
public SecondClass secondClass;
public ArrayList<Integer> arrayList;


//shortcut for creating constructor
    // for mac: command+N
    // for windows: alt+insert


    public FirstClass(int a, String b, SecondClass secondClass) {
        this.a = a;
        this.b = b;
        this.secondClass = secondClass;
    }



    public String toString() {
        return "FirstClass{" +
                "a=" + a +
                ", b='" + b + '\'' +
                ", secondClass=" + secondClass +
                ", arrayList=" + arrayList +
                '}';
    }


}
