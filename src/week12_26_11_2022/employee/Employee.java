package week12_26_11_2022.employee;

public class Employee {

    public String name;
    public int id;
    public char gender;

    public Employee(String name, int id, char gender) {
        this.name = name;
        id = id;
        this.gender = gender;
    }
    public Employee(String name){
        this.name=name;
    }
  /*
    public Employee(String name, int id){
        this.name=name;
        this.id=id;
    }


   */

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gender=" + gender +
                '}';
    }
}
