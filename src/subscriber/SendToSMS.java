package subscriber;

public class SendToSMS implements ISubscriber{
    private final String contact;

    public SendToSMS(String contact) {
        this.contact = contact;
    }
    @Override
    public void send() {
        System.out.println("SendToSMS.send");
    }
}
