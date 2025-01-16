package OpenClosePrincipleGoodExample;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        PaymentMethod creditCard = new CreditCard();
        paymentProcessor.processPaymentRequest( creditCard,100);

        PaymentMethod debitCard = new DebitCard();
        paymentProcessor.processPaymentRequest(debitCard,200);

        PaymentMethod payPal = new Paypal();
        paymentProcessor.processPaymentRequest(payPal,300);

        //so now if you wanna add the upi
        //create a class that implements paymentmethod

        PaymentMethod upi = new UPI();
        paymentProcessor.processPaymentRequest(upi,400);

    }
}
