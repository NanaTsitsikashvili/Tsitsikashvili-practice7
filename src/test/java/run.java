public class run {
    public static void main(String[] args) {
        System.out.println("Task1");
        System.out.println();//blank line
        Shape shape1 = new Circle();
        shape1.draw();

        Shape shape2 = new Rectangle();
        shape2.draw();

        Shape shape3 = new Triangle();
        shape3.draw();

        System.out.println();// blank line
        System.out.println("Task2");

        Notification notification1 = new EmailNotification();
        notification1.sendNotification(" E-mail Notification");

        Notification notification2 = new SMSNotification();
        notification2.sendNotification(" SMS Notification.");

        System.out.println(); //blank line
        System.out.println("Task3");

        PaymentProcessor processor1 = new CreditCardProcessor();
        processor1.processPayment(15.48);

        PaymentProcessor processor2 = new PayPalProcessor();
        processor2.processPayment(250);

    }
}