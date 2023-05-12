package DP.Builder.House;

public class House{
    protected String door;
    protected String roof;
    protected String windows;

    public House(){
        this.door="NULL";
        this.roof="NULL";
        this.windows="NULL";
    }

    public void SetDoor(String door){
        this.door=door;
    }

    public void SetRoof(String roof){
        this.roof=roof;
    }

    public void SetWindows(String windows)
    {
        this.windows=windows;
    }
    public void Print(){
        System.out.println(door+" "+roof+" "+windows);
    }

}