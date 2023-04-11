package DP.Abstract_Factory;

public class VictorianFurnitureFactory implements FurnitureFactory{
    String addOns;
    String original;
    String model;
    
    public void CreateChair(){
        addOns="loyal teapot";
        original="Enpasica palace";
        model="Golden Chair";
    }

    public void CreateCoffeeTable(){
        addOns="loyal lamp";
        original="Egypt catacomb";
        model="table of death";
    }

    public void CreateSofa(){
        addOns="loyal paint";
        original="Paris museum";
        model="Sofa made by elephant's skin";
    }

    public void CommercialBreak(){
        System.out.println("buy a "+model+" from "+ original+" with "+addOns+" for free");
    }
}
