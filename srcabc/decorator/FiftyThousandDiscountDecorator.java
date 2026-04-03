package decorator;

public class FiftyThousandDiscountDecorator extends BaseDiscountDecorator{
    public FiftyThousandDiscountDecorator(BaseDiscountComponent wrappee) {
        super(wrappee);
    }

    @Override
    public double getPrice() {
        return super.getPrice() - 50_000;
    }
}
