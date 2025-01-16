package SingleResponsibilityBadCode;

public class Invoice {
    private  double amount;
    public Invoice(double amount) {
        this.amount = amount;
    }

    public void generateInvoice() {
        System.out.println("Invoice generated for amount: " + amount);
    }

    public void savetoDatabase() {
        System.out.println("Invoice saved to Database ");
    }
    //bad code
    public  void sendEmail() {
        System.out.println("Invoice sending email");
    }

    //bad code  : as multiple responsibilities are assigned to single class
    //Emails are totally unreleated here to envoice
    // saving into data base is also not required here
}
