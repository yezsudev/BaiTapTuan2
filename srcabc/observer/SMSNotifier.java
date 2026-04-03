package observer;

public class SMSNotifier implements OrderSubscriber{
    @Override
    public void update(String message) {
        System.out.println("SMS notify for event: " + message);
    }
}
