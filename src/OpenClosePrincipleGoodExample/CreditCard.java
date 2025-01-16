package OpenClosePrincipleGoodExample;

public class CreditCard implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Payment via Credit Card" + amount);

    }
}
