package week11_19_11_2022.myCalculator;

public class MyCalculatorV1 {

public int plus(int a, int b){

    return a+b;
}

public int minus(int a,int b){
    return a-b;
}

public int multiply(int a, int b){
    return a*b;
}

public int divide(int a, int b){
    return  a/b;
}



}




/*
Task-2
version 1: without instance variables and no setInfo method
Create a "MyCalculator" class that has instance methods which can do simple math operations on two numbers. The methods are: plus, minus, multiply and divide.
All the methods get two ints then the method does the required math operation and returns the result as an int.

In version one we just have instance methods with parameters (actions) no attributes of the class
 */