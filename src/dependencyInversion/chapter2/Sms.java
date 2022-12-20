package dependencyInversion.chapter2;

public class Sms implements Message {
    @Override
    public void sendMessage() {
        sendSms();
    }

    private void sendSms() {
        // send Sms
    }
}
