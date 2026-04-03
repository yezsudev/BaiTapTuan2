package factory_method;

public abstract class DeliverFactory {
    abstract Deliverer createDeliverer();

    public void calcFee() {
        Deliverer deliverer = createDeliverer();
        deliverer.deliver();
        System.out.println("Fee: " + String.valueOf(deliverer.calcFee()));
    }
}
