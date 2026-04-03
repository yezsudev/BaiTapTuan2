package observer;

public class AppNotifier implements OrderSubscriber{
    @Override
    public void update(String message) {
        System.out.println("App notify for event: " + message);
    }
}
