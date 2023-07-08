package Builder;

import lombok.Builder;
import lombok.Getter;

@Getter


public class Employee {
    private Integer empId;
    private String name;
    private Department department;
    private Double experience;
    private Double Salary;

    //Constructor hiding
    private  Employee(){

    }


    public static class Builder {
        Employee employee=new Employee();

        public Builder(){

        }

        public Builder withEmpId(Integer empId){
            employee.empId = empId;
            return this;
        }

        public Builder withName(String name){
            employee.name = name;
            return this;
        }

        public Builder withDepartment(Department department){
            employee.department = department;
            return this;
        }

        public Builder withExperience(Double experience){
            employee.experience = experience;
            return this;
        }



        public Employee build(){

            return employee;
        }


    }

}
