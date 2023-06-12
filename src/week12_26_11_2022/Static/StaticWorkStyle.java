package week12_26_11_2022.Static;

public class StaticWorkStyle {

    static {
        System.out.println("first static");
    }
    static {
        System.out.println("second static");
    }

    public static void main(String[] args) {

        methodStatic();
        System.out.println("main method");


    }
    public  static void methodStatic(){
        System.out.println("Method Static");
    }

    static {
        System.out.println("third static");
    }

}
