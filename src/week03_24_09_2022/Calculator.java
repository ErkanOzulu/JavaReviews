package week03_24_09_2022;

import java.sql.SQLOutput;

public class Calculator {
    public static void main(String[] args) {

        double n1 = 12.1, n2=13.5;
        double result=0;
        char mathOperator='+';

if (mathOperator=='+'||mathOperator=='-'||mathOperator=='*'||mathOperator=='/'){


if (mathOperator=='+'){
    result=n1+n2;
} else if (mathOperator=='-') {
    result=n1-n2;
} else if (mathOperator=='*') {
result=n1*n2;
} else if (mathOperator=='/') {
    result=n1/n2;
}
        System.out.println(result);

    } else{
    System.out.println("Invalid Operator");
    }
        System.out.println("--------------------second way-----------------");


        double n11 = 20.5,
                n22 = 10.5;

        char operator = '+';

        double result1 = 0;

        if(operator == '+'){
            result1 = n11 + n22;
        }else if(operator == '-'){
            result1 = n11 - n22;
        }else if(operator == '*'){
            result1 = n11 * n22;
        }else if(operator == '/'){
            result1 = n11 / n22;
        }

        System.out.println(result1);





    }

    }



/*
2. Create a class called Calculator, Given two double variables named n1
& n2, and a char variable named mathOperator, write a program that can
calculate result of n1&n2 based on the given math Operator.
char operator -> -, +, *, /
when operator is + : add num1, num2
when operator: - : minus num1, num2
when operator: * : multiply num1, num2
when operator: / : divide num1, num2
for any other operators: print "invalid operator"
Ex:
n1 = 10, n2= 20, mathOperator = '+'
output:
30
 */