package DP.Adapter;

public class Euro2DongAdapter extends UKClient {
    private UKClient hank;

    public Euro2DongAdapter(UKClient hank){
        this.hank=hank;
    }
    @Override
    public int Sell() {
        return hank.Sell()*50000;
    }
    
}
