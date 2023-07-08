package BehaviouralDesignPattern.Observer;

import java.util.*;

public class BitcoinTracker implements Subject{
    private List<Observer> subscribersList = new ArrayList<>();
    @Override
    public void addPrice() {
        if(!subscribersList.isEmpty()){
            for(Observer subscriber : subscribersList){
                subscriber.takeAction();
            }
        }
    }

    @Override
    public void addSubscriber(Observer subscriber) {
        int a=5;
        Integer n = a;
        int b = n;
        subscribersList.add(subscriber);
    }

    @Override
    public void removeSubscriber(Observer subscriber) {
        subscribersList.remove(subscriber);
    }
}
