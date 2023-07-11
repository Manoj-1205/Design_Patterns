package DecoratorPattern;

import DecoratorPattern.NotificationDecorator.EmailNotification;
import DecoratorPattern.NotificationDecorator.PhoneNotification;

public class Main {
    public static void main(String[] args) {
        NotificationSender notificationSender=new TextNotification();
        NotificationSender phoneNotification = new PhoneNotification(notificationSender);
        NotificationSender emailNotification = new EmailNotification(notificationSender);
        NotificationSender emailPhoneNotification = new EmailNotification(phoneNotification);

        System.out.println(emailPhoneNotification.sendMessage());
    }
}
