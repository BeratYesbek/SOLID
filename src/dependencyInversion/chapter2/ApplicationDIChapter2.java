package dependencyInversion.chapter2;

public class ApplicationDIChapter2 {
    public static void main(String[] args) {
       Notification notification = new Notification(new TelegramBot());
       notification.sendMessage();
    }
}
