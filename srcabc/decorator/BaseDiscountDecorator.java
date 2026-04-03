package decorator;

public class BaseDiscountDecorator implements BaseDiscountComponent {
    protected BaseDiscountComponent wrappee;

    public BaseDiscountDecorator(BaseDiscountComponent wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public double getPrice() {
        return wrappee.getPrice();
    }
}
