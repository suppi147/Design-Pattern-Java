package DP.Adapter;



public class demo {
    public static void main(String [] args){
        VNClient hoang= new VNClient(21, 50000);
        hoang.Buy();
        hoang.Show();

        UKClient Sam=new UKClient(22222, 32);
        Sam.Buy();
        Sam.Show();

        Euro2DongAdapter moneyConverter= new Euro2DongAdapter(Sam);
        System.out.println("Sam's money to dong: "+moneyConverter.Sell()+" dong");



    }
}
