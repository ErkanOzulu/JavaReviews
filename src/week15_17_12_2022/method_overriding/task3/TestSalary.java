package week15_17_12_2022.method_overriding.task3;

public class TestSalary {

    public static void main(String[] args) {
        Employee employee=new Employee();

       // System.out.println(employee.salary());

        System.out.println("============");

        Manager manager=new Manager();
        System.out.println(manager.salary());
    }
}