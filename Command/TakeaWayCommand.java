package DP.Command;

public class TakeaWayCommand implements Command {
    String boxsize;
    Kitchen dish;

    public TakeaWayCommand(String boxsize,Kitchen dish){
        this.boxsize=boxsize;
        this.dish=dish;
    }

    @Override
    public void MakeOrder() {
        dish.CookingFriedEgg();
        System.out.println("Take a way with "+boxsize);
    }
}
