package DecoratorPattern.NotificationDecorator;

import DecoratorPattern.NotificationSender;

public class PhoneNotification extends BaseDecorator{

//     priv
    public PhoneNotification(NotificationSender notificationSender){
        super(notificationSender);
    }
    @Override
    public String sendMessage() {
        return "Phone Notification + " + notificationSender.sendMessage();
    }
}
