package observer;

import java.util.ArrayList;
import java.util.List;

public class OrderPublisher {
    private final List<OrderSubscriber> subscribers = new ArrayList<>();
    private String message;

    public void subscribe(OrderSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(OrderSubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        subscribers.forEach(subscriber -> {
            subscriber.update(message);
        });
    }

    public void createOrder() {
        setMessage("OrderCreated");
        notifySubscribers();
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
