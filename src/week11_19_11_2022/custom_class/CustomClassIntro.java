package week11_19_11_2022.custom_class;

public class CustomClassIntro {
    public static void main(String[] args) {

        //how to create an object

        // ClassName reference =new keyword constructor

        SecondClass secondClass=new SecondClass();
        FirstClass firsObject=new FirstClass(4,"Adam",secondClass);

        //how to get attributes

        System.out.println(firsObject.a);
        System.out.println(firsObject.b);


    }
}
