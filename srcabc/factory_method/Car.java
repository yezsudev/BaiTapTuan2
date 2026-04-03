package factory_method;

public class Car implements Deliverer{
    @Override
    public void deliver() {
        System.out.println("giao liên tỉnh");
    }

    @Override
    public double calcFee() {
        return 100_000;
    }
}
