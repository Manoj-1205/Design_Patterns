package FactoryPattern.AbstractFactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public abstract class ClassroomFactory {
    private Integer id;
    private String name;
    public abstract Classroom createTeacher();
    public abstract Classroom createStudent();

}
