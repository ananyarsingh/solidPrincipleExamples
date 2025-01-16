package SingleResponsibilityGoodCode;

public class Invoice {
    private  double amount;
    public Invoice(double amount) {
        this.amount = amount;
    }

    public void generateInvoice() {
        System.out.println("Invoice generated for amount: " + amount);
    }

//Good example  :
    //Inventory Repository would help in saving to database
    //sending email class would send notifications to the user 
}