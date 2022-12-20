package dependencyInversion.chapter2;

public class Email implements Message{
    @Override
    public void sendMessage() {
        sendEmail();
    }

    private void sendEmail() {
        // send email
    }
}
