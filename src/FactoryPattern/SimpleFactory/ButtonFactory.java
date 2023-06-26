package FactoryPattern.SimpleFactory;

public class ButtonFactory {
    //Violates SRP and OCP
    public static Button createButton(ButtonType type){
        switch(type){
            case SUBMIT : return new SubmitButton();
            case RESET : return new ResetButton();
        }
        throw new RuntimeException("Invalid Button Type");
    }
}
