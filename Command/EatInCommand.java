package DP.Command;

public class EatInCommand  implements Command{
    int tableNumber;
    Kitchen dish;
     

    public EatInCommand(int tableNumber, Kitchen Dish){
        this.tableNumber= tableNumber;
        this.dish=Dish;
    }

    @Override
    public void MakeOrder() {
        dish.CookingBeefSteak();
        System.out.println("bring dish to table "+this.tableNumber);
    }

}
