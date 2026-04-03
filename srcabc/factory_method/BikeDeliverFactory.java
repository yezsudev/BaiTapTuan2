package factory_method;

public class BikeDeliverFactory extends DeliverFactory{
    @Override
    Deliverer createDeliverer() {
        return new Bike();
    }
}
