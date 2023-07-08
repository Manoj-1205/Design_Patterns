package Builder;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee.Builder()
                .withEmpId(26)
                .withDepartment(Department.Support)
                .withName("Manoj")
                .build();


        System.out.println(employee.getEmpId()+" "+ employee.getName());

    }
}
