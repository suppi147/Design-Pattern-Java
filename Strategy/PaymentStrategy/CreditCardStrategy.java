package DP.Strategy.PaymentStrategy;

public class CreditCardStrategy implements PaymentStrategy{
    String creditcardnumber;

    public CreditCardStrategy(String creditcardnumber){
        this.creditcardnumber=creditcardnumber;
    }
    @Override
    public Boolean ValidatePaymentDetails() {
        if(this.creditcardnumber.equals("126538271361")){
        return true;
        }
        return false;
    }
    @Override
    public void Pay(int amount) {
        System.out.println("Customer pay with the money of "+ amount+" for the credit card id "+ creditcardnumber);
    }
}
