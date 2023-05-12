package DP.Factory_Method;


public class demo {
    public static void main(String[] args){
        RoadLogistic MerchantCompany= new RoadLogistic(324,23);
        MerchantCompany.CreateProduct();
        MerchantCompany.ReviewRevenue();
        MerchantCompany.Summary();

        SeaLogistic SeaturtleCompany= new SeaLogistic(12,345,22);
        SeaturtleCompany.CreateProduct();
        SeaturtleCompany.ReviewRevenue();
        SeaturtleCompany.Summary();
    }
}
