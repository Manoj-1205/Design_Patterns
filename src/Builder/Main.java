package Builder;

public class Main {
    public static void main(String[] args) {
        Employee employee = Employee
                .builder()
                .withEmpId(26)
                .withDepartment(Department.Support)
                .withName("Manoj")
                .build();


        System.out.println(employee.getEmpId()+" "+ employee.getName());

    }
}
