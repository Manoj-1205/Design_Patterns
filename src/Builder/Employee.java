package Builder;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder

public class Employee {
    private Integer empId;
    private String name;
    private Department department;
    private Double experience;
    private Double Salary;


}
