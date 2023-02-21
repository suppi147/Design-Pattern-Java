package DP.Visitor;

import DP.Visitor.InsuranceCustomer.Bank;
import DP.Visitor.InsuranceCustomer.Restaurant;
import DP.Visitor.InsuranceVisitor.InsuranceMessagingVisitor;
import DP.Visitor.InsuranceVisitor.Visitor;

public class Demo {
    public static void main(String[] args) {
        Visitor visitor=new InsuranceMessagingVisitor();
        Bank bank=new Bank("Street AAA");
        Restaurant restaurant=new Restaurant("Street BBB");
        bank.Accept(visitor);
        restaurant.Accept(visitor);
    }   
}
