package week13_03_12_2022.access_modifiers.pack2;
import week13_03_12_2022.access_modifiers.pack1.Person;
public class DefaultTest {

    public static void main(String[] args) {
        //we can not reach default access modifier outside the package
        //  System.out.println(new Person().lastName);
    }
}
