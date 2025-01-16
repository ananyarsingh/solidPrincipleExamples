package OpenClosePrincipleBadExample;

public class PaymentProcessor {
    public void processPaymentRequest(String paymentMethod, double amount) {
        if (paymentMethod.equals("CreditCard")) {
            System.out.println("Payment method credit card processed" + amount);
        }
        else if (paymentMethod.equals("DebitCard")) {
            System.out.println("Payment method debit card processed" + amount);
        }else if (paymentMethod.equals("Paypal")) {
            System.out.println("Payment method Paypal processed" + amount);
        }else {
            throw new IllegalArgumentException("Payment method not supported"+ paymentMethod);
        }

        //problems :
        //now you wanna add a new payment method : upi : then you will have to write else if
        // for upi
        // to fix this using abstract class / interface


    }
}
