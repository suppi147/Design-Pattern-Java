package DP.Factory_Method;

public class RoadLogistic extends Logistic{
    int trucksNumber;
    int distance;
    public RoadLogistic(){
        trucksNumber=1;
        distance=0;
    }
    public RoadLogistic(int trucksNumber,int distance){
        this.trucksNumber=trucksNumber;
        this.distance=distance;
    }

    public void CreateProduct(){
        super.products="cement sacks";
    }
    public void ReviewRevenue(){
        super.revenue = trucksNumber*100 - distance*2;
    }

}
