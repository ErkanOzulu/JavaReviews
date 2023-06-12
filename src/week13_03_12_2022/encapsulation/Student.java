package week13_03_12_2022.encapsulation;

public class Student {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name.equals("XXXXX"))
            System.out.println("you can not give that name");
        else
            this.name = name;
    }


    public void setAge(int age) {
        if (age < 0)
            System.out.println("you can not put age smaller than 0");
        else
            this.age = age;
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
