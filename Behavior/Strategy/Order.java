package DP.Strategy;

import DP.Strategy.PaymentStrategy.PaymentStrategy;

public class Order {
    private PaymentStrategy paymentStrategy;

    public Order(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }

    public void ProcessOrder(int amount){
        if(paymentStrategy.ValidatePaymentDetails()){
            paymentStrategy.Pay( amount);
        }
    }
}
