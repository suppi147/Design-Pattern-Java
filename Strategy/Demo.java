package DP.Strategy;

import DP.Strategy.PaymentStrategy.CreditCardStrategy;
import DP.Strategy.PaymentStrategy.PaypalPayment;

public class Demo {
    public static void main(String[] args) {
        Order order1=new Order(new PaypalPayment("hi@gm.com","hi"));
        order1.ProcessOrder(12321);

        Order order2=new Order(new CreditCardStrategy("126538271361"));
        order2.ProcessOrder(999);
    }
}
