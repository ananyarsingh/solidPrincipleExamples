package OpenClosePrincipleGoodExample;

public class PaymentProcessor {
    public void processPaymentRequest(PaymentMethod paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }
}
