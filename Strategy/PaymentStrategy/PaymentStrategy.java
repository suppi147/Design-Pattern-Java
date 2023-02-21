package DP.Strategy.PaymentStrategy;

public interface PaymentStrategy {
    Boolean ValidatePaymentDetails();
    void Pay(int amount);
}
