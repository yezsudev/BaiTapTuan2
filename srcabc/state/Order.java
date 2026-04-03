package state;

public class Order {
    OrderState state = new CreatedState();

    public String viewState() {
        return this.state.toString();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void pay() {
        this.state.pay(this);
    }

    public void cancel() {
        this.state.cancel(this);
    }

    public void ship() {
        this.state.ship(this);
    }

    public void deliver() {
        this.state.deliver(this);
    }
}
