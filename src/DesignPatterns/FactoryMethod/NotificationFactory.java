package DesignPatterns.FactoryMethod;

public class NotificationFactory {
    public Notification createNotification(String type) {
        if ("EMAIL".equalsIgnoreCase(type)) return new EmailNotification();
        return new SmsNotification();
    }
}
