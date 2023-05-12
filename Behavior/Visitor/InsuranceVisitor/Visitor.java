package DP.Visitor.InsuranceVisitor;

import DP.Visitor.InsuranceCustomer.Bank;
import DP.Visitor.InsuranceCustomer.Restaurant;

public interface Visitor {
    void VisitBank(Bank bank);
    void VisitRestaurant(Restaurant restaurant);
}
