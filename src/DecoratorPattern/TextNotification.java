package DecoratorPattern;

public class TextNotification implements NotificationSender{
    @Override
    public String sendMessage() {
        return "Text Message";
    }
}
