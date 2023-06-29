package BehaviouralDesignPattern.Observer.ListOfSubscribers;

import BehaviouralDesignPattern.Observer.Observer;
import org.w3c.dom.ls.LSOutput;

public class Bill implements Observer {

    @Override
    public void takeAction() {
        System.out.println("Bill notified");
    }
}
