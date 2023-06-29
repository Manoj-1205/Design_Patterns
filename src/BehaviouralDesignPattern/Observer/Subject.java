package BehaviouralDesignPattern.Observer;

public interface Subject {
    void addPrice();
    void addSubscriber(Observer subscriber);
    void removeSubscriber(Observer subscriber);
}
