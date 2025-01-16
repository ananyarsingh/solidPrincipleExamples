package DependencyInversionGoodExample;

public class NotificationService {
    private NotificationChannel notificationChannel;
    public NotificationService(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }
    //channel is supplied through constructor

    public void notify(String message) {
        notificationChannel.sendMessage(message);
    }
}
