abstract class Notification {
    public abstract void sendNotification(String message);
}

class EmailNotification extends Notification {
    public void sendNotification(String message) {
        System.out.println("Sending email notification: " + message);
    }
}

class PayPalProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment " + amount);
    }
}
