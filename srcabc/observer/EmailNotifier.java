package observer;

public class EmailNotifier implements OrderSubscriber{
    @Override
    public void update(String message) {
        System.out.println("Email notify for event: " + message);
    }
}
