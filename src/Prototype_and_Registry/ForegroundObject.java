package Prototype_and_Registry;

public class ForegroundObject {

        BackgroundObject secondObj = Registry.getPrototype(BackgroundObjectType.TREE).clone();
        public void show(){
            System.out.println(secondObj);
        }

}
