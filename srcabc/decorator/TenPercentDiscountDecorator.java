package decorator;

public class TenPercentDiscountDecorator extends BaseDiscountDecorator {
    public TenPercentDiscountDecorator(BaseDiscountComponent wrappee) {
        super(wrappee);
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 0.9;
    }
}
