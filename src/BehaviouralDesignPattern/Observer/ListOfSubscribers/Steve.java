package BehaviouralDesignPattern.Observer.ListOfSubscribers;

import BehaviouralDesignPattern.Observer.Observer;

public class Steve implements Observer {
    @Override
    public void takeAction() {
        System.out.println("Steve notified");
    }
}
