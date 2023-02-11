package DP.Builder;
import DP.Builder.House.HouseType;

public class HouseDirector {
    HouseBuilder builder;
    HouseDirector(HouseBuilder builder){
        this.builder=builder;
    }
    public void Make(HouseType type){
        if(type==HouseType.FLOWER){
            builder.buildDoor("Sunflower door");
            builder.buildRoof("Glass roof");
            builder.buildWindows("Grass Windows");
        }
        else if(type == HouseType.FLOWERYPURE){
            builder.buildDoor("Glass door");
            builder.buildRoof("Sky roof");
            builder.buildWindows("Ice Windows");
        }
    };
}
