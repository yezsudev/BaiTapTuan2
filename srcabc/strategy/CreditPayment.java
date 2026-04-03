package strategy;

public class CreditPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán bằng thẻ: " + String.valueOf(amount));
    }
}
