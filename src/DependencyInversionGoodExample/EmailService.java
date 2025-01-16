package DependencyInversionGoodExample;

public class EmailService implements NotificationChannel{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email to " + message);
    }
}
