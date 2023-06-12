package week11_19_11_2022.custom_class;

public class Employee {

    public String name;
    public  char gender;
    public  int employeeId;
    //in  order to print att toString()


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", employeeId=" + employeeId +
                '}';
    }
}
