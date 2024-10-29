abstract class Notification {
    public abstract void sendNotification(String message);
}

class EmailNotification extends Notification {
    public void sendNotification(String message) {
        System.out.println("Sending email notification: " + message);
    }
}

class SMSNotification extends Notification {
    public void sendNotification(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}
