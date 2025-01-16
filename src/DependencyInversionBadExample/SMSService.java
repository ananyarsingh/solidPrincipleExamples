package DependencyInversionBadExample;

public class SMSService {
    public void smsService(String message) {
        System.out.println("SMS Service: " + message);
    }
}
