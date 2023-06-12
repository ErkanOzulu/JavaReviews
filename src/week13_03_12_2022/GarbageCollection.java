package week13_03_12_2022;

public class GarbageCollection {

    public static void main(String[] args) {

        // How we can make the objects unreferenced

        // 1- make it null
        String str="Mesut";

        str=null;
        System.out.println(str);

        //2 - assigning another value

        String str1="Adam";

        str1="Osman";
        System.out.println(str1);


    }
}


        /*
public ------class+package+subclass+world

protected----- class+package+subclass

default(no modifier)-------
class+package

private------- class

public String name;
    // with public we can reach from everywhere

    String lastName; // this is default access modifier
    // with default we can reach inside the same class and the same PACKAGE

    private int ID;
    // with private we can reach only inside the same lass


    protected int age;
    // with private we can reach only inside the same lass, package and sub classes
 */