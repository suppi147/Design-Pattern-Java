package DP.Command;

public class Demo {
    public static void main(String[] args) {
        Command order1= new EatInCommand(2, new Kitchen());
        Command order2= new TakeaWayCommand("round pan", new Kitchen());
        order1.MakeOrder();
        order2.MakeOrder();
    }   
}
