package FactoryPattern.FactoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        ButtonFactory buttonFactory = new ResetButtonFactory();
        Button submitButton = buttonFactory.createButton();
        submitButton.createButton();

    }
}
