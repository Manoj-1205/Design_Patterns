package DecoratorPattern.NotificationDecorator;

import DecoratorPattern.NotificationSender;

public class EmailNotification extends BaseDecorator{

    public EmailNotification(NotificationSender notificationSender){
        super(notificationSender);
    }
    @Override
    public String sendMessage() {
        return "Email Notification + "+notificationSender.sendMessage();
    }
}
