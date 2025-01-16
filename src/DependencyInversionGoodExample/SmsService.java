package DependencyInversionGoodExample;

public class SmsService implements NotificationChannel{
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS service message: " + message);
    }
}
