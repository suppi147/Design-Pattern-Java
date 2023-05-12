package DP.Builder;
import DP.Builder.House.House;
import DP.Builder.House.HouseType;

public class BluieHouseBuilder implements HouseBuilder {
    private House blueHouse;
    public BluieHouseBuilder(){   
       blueHouse=new House();
    }
    @Override
    public void buildDoor(String door) {
        blueHouse.SetDoor(door);
    }

    @Override
    public void buildRoof(String roof) {
        blueHouse.SetRoof(roof);
    }

    @Override
    public void buildWindows(String windows) {
        blueHouse.SetWindows(windows);
    }

    @Override
    public House GetResult() {
        return  blueHouse;
    }
}
