package strategy;

public class PaymentContext {
    PaymentStrategy paymentStrategy;

    void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    void pay(double amount) {
        paymentStrategy.pay((amount));
    }
}
