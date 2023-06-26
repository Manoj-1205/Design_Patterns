package FactoryPattern.SimpleFactory;

public class Main {
    public static void main(String[] args) {
        Button submitButton = ButtonFactory.createButton(ButtonType.RESET);
        submitButton.createButton();
    }
}
