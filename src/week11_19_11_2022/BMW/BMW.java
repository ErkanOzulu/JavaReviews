package week11_19_11_2022.BMW;

import java.security.PublicKey;
import java.time.LocalDate;

public class BMW {
    public String brand, model, color;
    public double price, mileage;
    public int year;
    public LocalDate dOfB;

    public BMW(String brand, String model, String color, double price, double mileage, int year, LocalDate dOfB) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.mileage = mileage;
        this.year = year;
        this.dOfB = dOfB;
    }

    public String getBrandName(){
        return brand;
    }


    public String toString() {
        return "BMW{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", mileage=" + mileage +
                ", year=" + year +
                ", dOfB=" + dOfB +
                '}';
    }

}
/*
Task 5 :


        Create a class for BMW
            - Create these variables in the class:
                 - brand,model,color (String),      // BMW,x5,White
                - price,mileage (double)           // 20000,10000
                - year (int)                       // 2015
                - DOfB(LocalDate)                   // 2015,5,20


        - Create these methods :
            - setInfo() (Or we can use constructor)
                - parameters: all atributes
                - returns: void
                - action: assigns necessary attributes for instance variables.

        - getBrandName()
             no parameters, returns the brand variable

        - toString()   generate the toString method as shown in class.

        - Create a class MainClass for BMW

        - Create BMW  objects, call the getBrandName and get methods of the objects
            - Create an Arraylist to recall ALL BMW that were build before 2017
            - Create an Arraylist to recall ALL BMW i8 that were build before 2016
 */