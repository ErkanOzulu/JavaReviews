package week11_19_11_2022.myCalculator;

public class MyCalculatorV2 {

    public int a;
    public int b;

    public MyCalculatorV2(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public String toString() {
        return "MyCalculatorV2{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public int plus(){

        return a+b;
    }
    public int minus(){
        return a-b;
    }

    public int multiply(){
        return a*b;
    }

    public int divide(){
        return  a/b;
    }


}


/*
version 2: with instance variables and with a setInfo method (or constructor) that sets value to integers which will be used in instance methods of the class we create
for example:
MyCalculatorV2 myCal2 = new MyCalculatorV2();
myCal2.setInfo(1,1);
myCal.plus();
returns:2
myCal.minus();
returns:0

 */