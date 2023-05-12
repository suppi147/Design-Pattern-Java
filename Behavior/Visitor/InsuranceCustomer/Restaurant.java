package DP.Visitor.InsuranceCustomer;

import java.beans.Visibility;

import DP.Visitor.InsuranceVisitor.Visitor;

public class Restaurant extends Customer {
    public Restaurant(String address){
        super(address);
    }
    
    public String GetAddress(){
        return super.address;
    }
    @Override
    public void Accept(Visitor visitor) {
        visitor.VisitRestaurant(this);
    }
}
