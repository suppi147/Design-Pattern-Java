package DP.Adapter;

public class VNClient extends StockMarket{    
    public VNClient(int shares,int currency){
        super(shares, currency);
    }
    public void Buy(){
        formula=shares+321*currency;
    }

    public int Sell(){
        return super.shares + 114*currency;
    }

    public void Show(){
        System.out.println(formula+" dong");
    }
}
