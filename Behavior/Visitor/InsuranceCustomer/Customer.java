package DP.Visitor.InsuranceCustomer;

import DP.Visitor.InsuranceVisitor.Visitor;

public abstract class Customer {
    String address;

    
    
    public Customer(String address){
        this.address=address;
    }
    public abstract void Accept(Visitor visitor);
}
