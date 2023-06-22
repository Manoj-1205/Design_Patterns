package Prototype_and_Registry;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@AllArgsConstructor
@Getter
@Setter

public class Registry {
    BackgroundObject backgroundObject;
    public static HashMap<BackgroundObjectType, BackgroundObject> map = new HashMap<>();

    public static void addPrototype(BackgroundObject backgroundObject){
        map.put(backgroundObject.getType(), backgroundObject);
    }

    public static BackgroundObject getPrototype(BackgroundObjectType type){
        return map.get(type);
    }
}
