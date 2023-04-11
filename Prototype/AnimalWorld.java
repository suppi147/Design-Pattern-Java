package DP.Prototype;

public abstract class AnimalWorld {
    String cellType;

    public AnimalWorld(){
        cellType="nothing";
    }
    public void SetCellType(String cellType){
        this.cellType=cellType;
    }

    public AnimalWorld(AnimalWorld animalWorld){
        if(animalWorld != null){
            this.cellType = animalWorld.cellType;
        }
    }

    public abstract AnimalWorld Clone();

}
