package DP.Prototype;

public class StarFishWorld extends InvertebrateWorld{
    String howWeEat;
    StarFishWorld(){
        howWeEat="nothing";
    }

    public StarFishWorld(StarFishWorld starFishWorld){
        super(starFishWorld);
        if(starFishWorld!= null){
            this.howWeEat=starFishWorld.howWeEat;
        }
    }

    public void SetHowWeEat(String howWeEat){
        this.howWeEat=howWeEat;
    }

    @Override
    public AnimalWorld Clone() {
        return new StarFishWorld(this);
    }

    public void Share(){
        System.out.println(howWeEat+" "+type+" "+cellType);
    }
}
