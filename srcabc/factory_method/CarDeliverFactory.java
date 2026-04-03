package factory_method;

public class CarDeliverFactory extends DeliverFactory{
    @Override
    Deliverer createDeliverer() {
        return new Car();
    }
}
