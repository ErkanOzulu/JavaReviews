package week11_19_11_2022.BMW;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class BMWObjects {
    public static void main(String[] args) {

        BMW car1=new BMW("BMW","X5","White",20000,10000,2015, LocalDate.of(2015,5,20)
        );
        BMW car2=new BMW("BMW","i5","Black",18000,15000,2018, LocalDate.of(2018,5,20)
        );
        BMW car3=new BMW("BMW","i3","White",15000,20000,2017, LocalDate.of(2017,5,20)
        );
        BMW car4=new BMW("BMW","i8","Black",25000,12000,2016, LocalDate.of(2016,5,20)
        );
        BMW car5=new BMW("BMW","i8","White",12000,14000,2012, LocalDate.of(2012,5,20)
        );

        String brand=car1.getBrandName();
        System.out.println(brand);
        ArrayList<BMW>bmws=new ArrayList<>();
        bmws.addAll(Arrays.asList(car1,car2,car3,car4,car5));

                bmws.removeIf(p-> p.year>2016);
        System.out.println(bmws);

        ArrayList<BMW>bmws1=new ArrayList<>(Arrays.asList(car1, car2,car3, car4, car5));
        bmws1.removeIf(p-> !(p.model=="i8" && p.year<2016));
        System.out.println(bmws1);





    }
}
/*
- Create these variables in the class:
                 - brand,model,color (String),      // BMW,x5,White
                - price,mileage (double)           // 20000,10000
                - year (int)                       // 2015
                - DOfB(LocalDate)                   // 2015,5,20
- Create a class MainClass for BMW

        - Create BMW  objects, call the getBrandName and get methods of the objects
            - Create an Arraylist to recall ALL BMW that were build before 2017
            - Create an Arraylist to recall ALL BMW i8 that were build before 2016
 */