package FlyweightPattern;

public class Main {
    public static void main(String[] args) {
        Bullet bullet=new Bullet("Sniper Bullet Object");
        //Pass the intrinsic bullet object to all the objects
        FlyingBullet flyingBullet = new FlyingBullet(0,0,20,500.9, 2.0, bullet);
        System.out.println(flyingBullet.getBullet().getImage());

    }
}
