package DependencyInversionGoodExample;

public class Main {
    public static void main(String[] args) {
        NotificationService emailNotification = new NotificationService(new EmailService());
        emailNotification.notify("abc@gmail.com");

        NotificationService smsNotification = new NotificationService(new SmsService());
        smsNotification.notify("OTP : 123456");

        //It ensures code is flexible
        //loose coupling between high and low level module
        // we can introduce new telegram service without touching the Notification service
        //Notification service only depends on interface, so testing becomes easy
    }
}
