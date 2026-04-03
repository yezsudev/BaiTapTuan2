package state;

public class ShippedState implements OrderState {
    @Override
    public void pay(Order order) {
        System.err.println("Order can't paid!");
    }

    @Override
    public void cancel(Order order) {
        System.err.println("Order can't canceled!");
    }

    @Override
    public void ship(Order order) {
        System.err.println("Order can't shipped!");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Order is delivered!");
        order.setState(new DeliveredState());
    }

    @Override
    public String toString() {
        return "Shipped";
    }
}
