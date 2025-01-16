package OpenClosePrincipleGoodExample;

public class DebitCard implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Payment via Debit Card"+ amount);

    }
}
