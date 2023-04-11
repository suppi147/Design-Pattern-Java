package DP.Visitor.InsuranceCustomer;

import DP.Visitor.InsuranceVisitor.Visitor;

public class Bank extends Customer {
    public Bank(String address){
        super(address);
    }

    public String GetAddress(){
        return super.address;
    }

    @Override
    public void Accept(Visitor visitor) {
        visitor.VisitBank(this);
        
    }
}
