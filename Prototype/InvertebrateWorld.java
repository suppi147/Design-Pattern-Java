package DP.Prototype;

public class InvertebrateWorld extends AnimalWorld{
   public String type;
    public InvertebrateWorld(){
        type="nothing";
    }

    public InvertebrateWorld(InvertebrateWorld invertebrateWorld){
        super(invertebrateWorld);
        if(invertebrateWorld!=null){
            this.type= invertebrateWorld.type;
        }
    }

    public void SetType(String type){
        this.type=type;
    }

    @Override
    public AnimalWorld Clone() {
        return new InvertebrateWorld(this);
    }
    
}
