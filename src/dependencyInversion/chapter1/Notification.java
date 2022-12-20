package dependencyInversion.chapter1;

public class Notification {

    public void sender(NotificationType notificationType) {
        if (notificationType == NotificationType.SMS) {
            new Sms().sendSMS();
        } else if (notificationType == NotificationType.EMAIL) {
            new Email().sendEmail();
        }
    }
}
