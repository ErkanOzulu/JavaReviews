package week03_24_09_2022;

public class SalaryAfterTax {
    public static void main(String[] args) {
        char married='Y';

        double salary=79_000,
                netSalary,
                taxRate1=0.35,
                taxRate2=0.30,
                taxRate3=0.25,
                taxRate4=0.20,
                taxDiscount=0.05;
        if (salary>=130_000&& married=='Y'){
              netSalary = salary-(salary*(taxRate1-taxDiscount));
        } else if (salary>=130_000) {
            netSalary = salary-(salary*taxRate1);
        } else if (salary>=100_000&&salary<130_000&& married=='Y') {
            netSalary = salary-(salary*(taxRate2-taxDiscount));
        } else if (salary>=100_000&&salary<130_000) {
            netSalary = salary-(salary*taxRate2);
        } else if (salary>=80_000&&salary<100_000&& married=='Y') {
            netSalary = salary-(salary*(taxRate3-taxDiscount));
        } else if (salary>=80_000&&salary<100_000) {
            netSalary = salary-(salary*taxRate3);
        } else if (salary<80_000&& married=='Y') {
            netSalary = salary-(salary*(taxRate4-taxDiscount));
        }else {
            netSalary = salary-(salary*taxRate4);
        }
        System.out.println("Your net salary is  "+netSalary);
    }
}

/*

           public static void main(String[] args) {
        double salary = 75_000;
        boolean isMarried = true;

        double taxRate = 0 ;

        if(salary>= 130000 ){ //false: salary < 130000;
            taxRate = 0.35; //35%
        }else if(salary>= 100000 ){ //false: salary < 100000;
            taxRate = 0.30; //30%
        }else if(salary>= 80000 ){ //false: salary < 80000
            taxRate = 0.25; //25%
        }else {
            taxRate = 0.20; //20%
        }


        if (isMarried){ // if the person is married
            taxRate -= 0.05; // subtracting 5% from the original tax rate
        }

        double salaryAfterTax = salary - (salary*taxRate);

        System.out.println("Salary After Tax = " + salaryAfterTax);

    }
}

/*
Salary After Tax= $63750.0
 */
/*
2. Write a program that can calculate the salary after tax based on the
following requirements
the tax rates are:
35% for salary of 130K or more
30% for salary of 100K to 130k
(excluded)
25% for salary of 80K to 100K
(excluded)
20% for salary less than 80K
in addition, if the person is married, he/she will pay 5%
less tax
 */