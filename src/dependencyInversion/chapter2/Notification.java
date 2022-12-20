package dependencyInversion.chapter2;

public class Notification {

    private final Message message;

    public Notification(Message message) {
        this.message = message;
    }

    public void sendMessage() {
        message.sendMessage();
    }
}
