package BehaviouralDesignPattern.Observer.ListOfSubscribers;

import BehaviouralDesignPattern.Observer.Observer;

public class Elon implements Observer {
    @Override
    public void takeAction() {
        System.out.println("Elon notified");
    }
}
