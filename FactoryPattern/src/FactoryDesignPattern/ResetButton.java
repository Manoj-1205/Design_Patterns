package FactoryDesignPattern;

public class ResetButton implements Button {
    @Override
    public void createButton() {
        System.out.println("Reset button is clicked..");
    }
}
