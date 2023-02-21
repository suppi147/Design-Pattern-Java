package DP.Visitor.InsuranceVisitor;

import DP.Visitor.InsuranceCustomer.Bank;
import DP.Visitor.InsuranceCustomer.Restaurant;

public class InsuranceMessagingVisitor implements Visitor {
    public void VisitBank(Bank bank){
        System.out.println("Sending bills for their insurance fee with the address"+ bank.GetAddress());
}   
    public void VisitRestaurant(Restaurant restaurant){
        System.out.println("Sending email for their insurance fee with the address "+ restaurant.GetAddress());
    }
}
