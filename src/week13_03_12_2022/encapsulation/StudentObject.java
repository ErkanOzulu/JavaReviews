package week13_03_12_2022.encapsulation;

public class StudentObject {
    public static void main(String[] args) {
        Student student=new Student();
        // student.name="XXXXX";
        // student.age=-12;
        student.setAge(12);
        student.setName("Adam");

        System.out.println(student);

        System.out.println(student.getAge());
        System.out.println(student.getName());
    }
}
