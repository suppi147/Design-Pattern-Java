package DP.Adapter;

public abstract class StockMarket {
    int shares;
    int currency;
    int formula;

    public StockMarket(){
        this.shares=0;
        this.currency=0;
        this.formula=0;
    }
    public StockMarket(int shares,int currency){
        this.shares=shares;
        this.currency=currency;
    }

    public abstract void Buy();
    public abstract int Sell();
    public abstract void Show();
}
