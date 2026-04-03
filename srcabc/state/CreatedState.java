package state;

public class CreatedState implements OrderState {

    @Override
    public void pay(Order order) {
        System.out.println("order is paid!");
        order.setState(new PaidState());
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Order is canceled!");
        order.setState(new CanceledState());
    }

    @Override
    public void ship(Order order) {
        System.err.println("Order can't shipped!");
    }

    @Override
    public void deliver(Order order) {
        System.err.println("Order can't delivered!");
    }

    @Override
    public String toString() {
        return "created";
    }
}
