package week11_19_11_2022.custom_class;

public class EmployeeTest {
    public static void main(String[] args) {
        String employee1="Adam 12345";
        Employee employee=new Employee();

        employee.name="Adam";
        employee.employeeId=12345;
        System.out.println(employee.name);
        System.out.println(employee.employeeId);

    }
}
