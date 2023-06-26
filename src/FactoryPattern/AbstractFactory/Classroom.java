package FactoryPattern.AbstractFactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public abstract class Classroom {
    private Integer id;
    private String name;
    public abstract void createUser(Integer id, String name);

}
