package factory_method;

public class DroneDeliverFactory extends DeliverFactory{
    @Override
    Deliverer createDeliverer() {
        return new Drone();
    }
}
