package week12_26_11_2022.Student;

import java.util.Scanner;

public class StudentObject {
    public static void main(String[] args) {
        String name="Adam";

        Student student1=new Student(name);

        System.out.println( student1);
        //I will get my age and batch numbre from user

        Scanner scanner=new Scanner(System.in);
        System.out.println("please input "+name+ "'s age");

        int age= scanner.nextInt();

        student1.age=age;

        System.out.println("please input "+name+"'s batch number");

        int batch= scanner.nextInt();


        student1.batchNumber=batch;


        System.out.println("student1 = " + student1);


    }
}
