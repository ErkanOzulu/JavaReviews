package week13_03_12_2022.encapsulation;

public class TeacherObject {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("Adam",1);

        //  teacher.name="XXXX";
        teacher.setName("XXXX");
        System.out.println(teacher.getName());
        teacher.setId(2);
        System.out.println(teacher.getId());


    }

}
