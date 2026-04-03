package factory_method;

public class Bike implements Deliverer{
    @Override
    public void deliver() {
        System.out.println("giao nội thành");
    }

    @Override
    public double calcFee() {
        return 1_000;
    }
}
