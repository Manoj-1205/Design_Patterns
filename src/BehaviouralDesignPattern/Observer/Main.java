package BehaviouralDesignPattern.Observer;

import BehaviouralDesignPattern.Observer.ListOfSubscribers.Bill;
import BehaviouralDesignPattern.Observer.ListOfSubscribers.Elon;
import BehaviouralDesignPattern.Observer.ListOfSubscribers.Steve;

public class Main {
    public static void main(String[] args) {
        BitcoinTracker bitcoinTracker = new BitcoinTracker();
        bitcoinTracker.addPrice();
        Elon elon=new Elon();
        Steve steve=new Steve();
        Bill bill=new Bill();
        bitcoinTracker.addSubscriber(elon);
        bitcoinTracker.addSubscriber(steve);
        bitcoinTracker.addSubscriber(bill);
        bitcoinTracker.addPrice();
    }
}
