package week11_19_11_2022.student;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class School {
    public static void main(String[] args) {
        ArrayList<Student>students=new ArrayList<>();
        Student student1=new Student("Osman",'M','A',LocalDate.of(2000,1,1), 111);
        Student student2=new Student("Erdem",'M','B', LocalDate.of(1999,1,1),111);

        Student student3=new Student("Veli",'M','A', LocalDate.of(2000,1,1),111);
        Student student4=new Student("Cevriye",'F','C', LocalDate.of(2000,1,1),111);
        Student student5=new Student("Aygun",'F','D', LocalDate.of(2000,1,1),111);

        //students.addAll(Arrays.asList(student1,student2,student3,student4,student5));
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        ArrayList<Student>result=getStudentsNameStartswithA(students);
        System.out.println(result);



    }

    private static ArrayList<Student> getStudentsNameStartswithA(ArrayList<Student> students) {



     /*
      for (Student student : students) {  //shortcut for add for loop "iter"
           if (student.name.startsWith("A"))
            result.add(student);
    }

      */
        students.removeIf(p-> !p.name.startsWith("A"));
        ArrayList<Student> result=new ArrayList<>(students);

        return result;
    }
}
/*
2. create a class which is School with main method

3. create a list of student in School class

4. create a method in School class which is getting list of students as parameter the return the list of students if the name start with "A"

 */