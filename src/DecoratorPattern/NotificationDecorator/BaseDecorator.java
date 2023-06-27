package DecoratorPattern.NotificationDecorator;

import DecoratorPattern.NotificationSender;

public abstract class BaseDecorator implements NotificationSender {
    protected  NotificationSender notificationSender;
    BaseDecorator(NotificationSender notificationSender){
        this.notificationSender = notificationSender;
    }

}
