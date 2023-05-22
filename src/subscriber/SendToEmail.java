package subscriber;

public class SendToEmail implements ISubscriber{
    private final String contact;

    public SendToEmail(String contact) {
        this.contact = contact;
    }

    @Override
    public void send() {
        System.out.println("SendToEmail.send");
    }
}
