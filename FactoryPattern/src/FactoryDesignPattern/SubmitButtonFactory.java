package FactoryDesignPattern;

public class SubmitButtonFactory implements ButtonFactory {
    @Override
    public Button createButton() {
        return new SubmitButton();
    }
}
