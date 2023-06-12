package week_20_28_01_2023.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test1 {
    public static void main(String[] args) {

        Map<String, String> spartan1= new TreeMap<>();

        spartan1.put("id","1");
        spartan1.put("name","Adam");
        spartan1.put("gender","M");
        System.out.println(spartan1);

        Map<String, String> spartan2= new LinkedHashMap<>();
        Spartan spartan=new Spartan();

        spartan2.put("id","2");
        spartan.setId("2");
        spartan2.put("id","2");


    }
}
