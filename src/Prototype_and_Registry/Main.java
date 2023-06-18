package Prototype_and_Registry;

public class Main {
    public static void main(String[] args) {
        //Prototype
        BackgroundObject prototype = new BackgroundObject(0,0,0,BackgroundObjectType.TREE);
        System.out.println(prototype.getX()+" "
                            + prototype.getY()+" "
                            + prototype.getZ());

        BackgroundObject clonedObj = prototype.clone();
        clonedObj.setX(10);
        clonedObj.setY(20);
        System.out.println(clonedObj.getX()+" "
                + clonedObj.getY()+" "
                + clonedObj.getZ());



    }
}
