package FactoryPattern.FactoryDesignPattern;

public class ResetButtonFactory implements ButtonFactory{
    @Override
    public Button createButton() {
        return new ResetButton();
    }
}
