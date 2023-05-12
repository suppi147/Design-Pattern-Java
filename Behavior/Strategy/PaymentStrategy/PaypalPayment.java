package DP.Strategy.PaymentStrategy;

public class PaypalPayment implements PaymentStrategy{

    String email;
    String password;

    

    public PaypalPayment(String email,String password){
        this.email=email;
        this.password=password;
    }

    @Override
    public Boolean ValidatePaymentDetails() {
        if(email.equals("hi@gm.com")&&password.equals("hi")){
            return true;
        }
        return false;
    }

    @Override
    public void Pay(int amount) {
        System.out.println("the amount of "+ amount+ " is payed by user "+ email);    
    }
}
