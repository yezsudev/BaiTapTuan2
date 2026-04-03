package decorator;

public class Order implements BaseDiscountComponent{
    private final double price;

    public Order (double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
