package OpenClosePrincipleGoodExample;

public class Paypal implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Payment via Paypal"+ amount);

    }
}
