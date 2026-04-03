package strategy;

public class MomoPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán bằng Momo: " + String.valueOf(amount));
    }
}
