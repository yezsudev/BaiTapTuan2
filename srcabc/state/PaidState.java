package state;

public class PaidState implements OrderState {

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
        System.out.println("Order is shipped!");
        order.setState(new ShippedState());
    }

    @Override
    public void deliver(Order order) {
        System.err.println("Order can't delivered!");
    }

    @Override
    public String toString() {
        return "Paid";
    }
}
