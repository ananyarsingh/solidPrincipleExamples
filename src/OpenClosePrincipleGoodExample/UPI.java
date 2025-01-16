package OpenClosePrincipleGoodExample;

public class UPI implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Paying UPI Payment : " + amount + " USD");
    }
}
