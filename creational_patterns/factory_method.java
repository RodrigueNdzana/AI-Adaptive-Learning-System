package factory_method;

public interface Notification {
    void send();
}

class EmailNotification implements Notification {
    public void send() {
        System.out.println("Email sent");
    }
}

abstract class NotificationFactory {
    public abstract Notification createNotification();
}

class EmailFactory extends NotificationFactory {
    public Notification createNotification() {
        return new EmailNotification();
    }
}