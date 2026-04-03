package factory_method;

public class Drone implements Deliverer{
    @Override
    public void deliver() {
        System.out.println("giao nhanh");
    }

    @Override
    public double calcFee() {
        return 10_000;
    }
}
