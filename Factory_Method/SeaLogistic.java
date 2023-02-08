package DP.Factory_Method;

public class SeaLogistic extends Logistic{
    int shipNumber;
    int containersNumber;
    int extraFee;
    public SeaLogistic(){
        shipNumber=1;
        containersNumber=0;
        extraFee=0;
    }
    public SeaLogistic(int shipNumber,int containersNumber, int extraFee){
        this.shipNumber=shipNumber;
        this.containersNumber=containersNumber;
        this.extraFee=extraFee;
    }

    public void CreateProduct(){
        super.products="cars";
    }
    public void ReviewRevenue(){
        super.revenue = (shipNumber+containersNumber)*120 - extraFee*22;
    }

}
