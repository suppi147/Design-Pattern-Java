package DP.Builder;
import DP.Builder.House.House;
import DP.Builder.House.HouseType;

public class demo {
    public static void main(String [] args){
        BluieHouseBuilder brandNewHouse=new BluieHouseBuilder();
        HouseDirector director= new HouseDirector(brandNewHouse);
        director.Make(HouseType.FLOWERYPURE);
        
        House SunflowerHouse=brandNewHouse.GetResult();
        SunflowerHouse.Print();
    }
}
