package week13_03_12_2022.warmup;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class School {
    /*
    2. create a class which is School with main method
    3. create a list of teacher in School class inside the STATIC BLOCK
    4. create a method in School class which is returning the list of teachers if the name start with "M"
    5. create a method in School class then you will find the female teachers
    6. create a method in School class then find the teachers age smaller than 30
    7. create a methot in School class then find the teachers born in 1967 year
     */
    static ArrayList<Teacher> teachers = new ArrayList<>();



    static {

        Teacher teacher1 = new Teacher("Muhtar", "Abc", 'M', LocalDate.of(1987, 1, 1), 1L);
        Teacher teacher2 = new Teacher("Gurhan", "Abc", 'M', LocalDate.of(1977, 1, 1), 2L);
        Teacher teacher3 = new Teacher("Asyun", "Abc", 'F', LocalDate.of(1967, 1, 1), 3L);
        Teacher teacher4 = new Teacher("Mike", "Abc", 'M', LocalDate.of(1970, 1, 1), 4L);
        Teacher teacher5 = new Teacher("Saim", "Abc", 'M', LocalDate.of(1981,10,24),12);
        Teacher teacher6 = new Teacher("Asya", "Abc", 'F', LocalDate.of(1990, 1, 1), 6L);

        teachers.addAll(Arrays.asList(teacher1, teacher5, teacher2, teacher3, teacher4, teacher6));


    }

    public static void main(String[] args) {
        System.out.println(teachers);

        ArrayList<Teacher> result = getTeachersNameStartWith("M");

        System.out.println(result);

        ArrayList<Teacher> females = getTeachersByGender('F');
        System.out.println(females);

        //create a method in School class then find the teachers age smaller than 30
        ArrayList<Teacher>smallerThanThirty =getTeachesAgeSmallerThanThirty(30);
        System.out.println(smallerThanThirty);

        //create a methot in School class then find the teachers born in 1967 year

        ArrayList<Teacher>bornIn= bornIn(1967);
        System.out.println(bornIn);


    }

    private static ArrayList<Teacher> bornIn(int year) {
        ArrayList<Teacher>result=new ArrayList<>();
        for (Teacher teacher : teachers) {
            if (teacher.dateOfBirth.getYear()==year){
                result.add(teacher);
            }

        }
        return result;

    }

    private static ArrayList<Teacher> getTeachesAgeSmallerThanThirty(int age) {
        ArrayList<Teacher>result=new ArrayList<>();

        for (Teacher teacher : teachers) {
            if (teacher.age<age){
                result.add(teacher);
            }

        }
        return result;
    }

    private static ArrayList<Teacher> getTeachersByGender(char gender) {
        ArrayList<Teacher> result = new ArrayList<>();

        //need to get teachers one by one
        for (Teacher teacher : teachers) {

            //check the gender if it is female
            if (teacher.gender == gender)

                //put in result
                result.add(teacher);

        }

        return result;


    }

    private static ArrayList<Teacher> getTeachersNameStartWith(String prefix) {

        ArrayList<Teacher> result = new ArrayList<>();


        //I need to get teacher one by one
        for (Teacher teacher : teachers) {

            // I need to check the name if the name is starting with "M"
            if (teacher.name.startsWith(prefix))

                //I will put inside result
                result.add(teacher);

        }
        return result;


    }
}


/*
   2. create a class which is School with main method

    3. create a list of teacher in School class inside the STATIC BLOCK

    4. create a method in School class which is returning the list of teachers if the name start with "M"

    5. create a method in School class then you will find the female teachers

    6. create a method in School class then find the teachers age smaller than 30

    7. create a methot in School class then find the teachers born in 1967 year
 */