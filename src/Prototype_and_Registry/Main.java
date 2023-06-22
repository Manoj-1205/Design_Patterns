package Prototype_and_Registry;

public class Main {
    public static void main(String[] args) {
        //Prototype
        BackgroundObject prototype = new BackgroundObject(0,0,0,BackgroundObjectType.TREE);
        Registry.addPrototype(prototype);

        ForegroundObject foregroundObject=new ForegroundObject();
        foregroundObject.show();


        System.out.println(prototype.getX()+" "
                            + prototype.getY()+" "
                            + prototype.getZ()+" "
                            + prototype.getType());

        BackgroundObject clonedObj = prototype.clone();
        clonedObj.setX(10);
        clonedObj.setY(20);
        clonedObj.setType(BackgroundObjectType.MOUNTAIN);
        System.out.println(clonedObj.getX()+" "
                + clonedObj.getY()+" "
                + clonedObj.getZ()+" "
                +clonedObj.getType());

        System.out.println(clonedObj);

    }
}
