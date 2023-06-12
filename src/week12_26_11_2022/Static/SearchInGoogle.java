package week12_26_11_2022.Static;


import static week12_26_11_2022.Static.BrowserUtils.*;

public class SearchInGoogle {

    public static void main(String[] args) {

        navigateUrl("Google");

        search("Adam");
        System.out.println(staticVariable);

    }
}
