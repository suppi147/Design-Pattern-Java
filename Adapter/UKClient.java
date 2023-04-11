package DP.Adapter;

public class UKClient extends StockMarket{    
    public UKClient(){
        
    }
    public UKClient(int shares,int currency){
        super(shares, currency);
    }
    public void Buy(){
        formula=2+shares+3*currency;
    }

    public int Sell(){
        return shares + 3*currency;
    }

    public void Show(){
        System.out.println(formula+" euro");
    }
}
