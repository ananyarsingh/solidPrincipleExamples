package DependencyInversionBadExample;

public class NotificationService {
    private EmailService emailService;
    private SMSService smsService;

    public NotificationService(){
        this.emailService = new EmailService();
        this.smsService = new SMSService();
    }

    public void notifyByEmail(String msg){
        emailService.sendEmail("abc", "xyz", msg);
    }
    public void notifyBySMS(String msg){
        smsService.smsService(msg);
    }
    /* Bad Example
    This Notification service is tightly couple with
    If someone changes lets say the method name sendEmail then it would a change here in
    notification too
    also if you wanna add telegram service then you have to add in constructor and
    stuff
    testing is also not easy
    and high level module is dependent on these low level modules
     */
}
