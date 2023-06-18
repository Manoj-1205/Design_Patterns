package Prototype_and_Registry;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class BackgroundObject implements ClonableObjects{
    private Integer x, y, z;
    private BackgroundObjectType type;
    @Override
    //Covariant Return Type
    public BackgroundObject clone() {
        System.out.println("Object Cloned...");
        return new BackgroundObject(x, y, z, type);
    }
}
