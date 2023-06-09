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

    public static Builder builder(){
        return new Builder();
    }
    public static class Builder extends Employee{
        private Integer empId;
        private String name;
        private Department department;
        private Double experience;


        public Builder withEmpId(Integer empId){
            this.empId = empId;
            return this;
        }

        public Builder withName(String name){
            this.name = name;
            return this;
        }

        public Builder withDepartment(Department department){
            this.department = department;
            return this;
        }

        public Builder withExperience(Double experience){
            this.experience = experience;
            return this;
        }



        public Employee build(){
            Employee employee = new Employee();
            employee.empId = this.empId;
            employee.name = this.name;
            employee.department = this.department;
            employee.experience = experience;
            return employee;
        }


    }

}
