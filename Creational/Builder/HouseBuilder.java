package DP.Builder;
import DP.Builder.House.House;
public interface HouseBuilder {
    public void buildDoor(String Door);
    public void buildRoof(String Roof);
    public void buildWindows(String Windows);
    public House GetResult();
}
