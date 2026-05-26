package DesignPatterns.FactoryMethod;

public class SmsNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("SMS sent!");
    }
}
