package FactoryPattern.FactoryDesignPattern;

public class SubmitButton implements Button {
    @Override
    public void createButton() {
        System.out.println("Submit Button is clicked..");
    }
}
