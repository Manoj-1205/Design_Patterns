package FlyweightPattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter


public class FlyingBullet {
    private Integer x;
    private Integer y;
    private Integer z;
    private Double speed;
    private Double direction;
    //Sharing the intrinsic field here

    private Bullet bullet;

}
