package FactoryPattern.FactoryDesignPattern;

public interface ButtonFactory {
    //Violates SRP and OCP
    public Button createButton();
}
