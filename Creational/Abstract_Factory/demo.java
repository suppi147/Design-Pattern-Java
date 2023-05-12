package DP.Abstract_Factory;

public class demo {
    
    public static void main(String [] args){
        ModernFurnitureFactory Z9000Company= new ModernFurnitureFactory();
        Z9000Company.CreateChair();
        Z9000Company.CommercialBreak();

        VictorianFurnitureFactory oldPalaceCompany= new VictorianFurnitureFactory();
        oldPalaceCompany.CreateCoffeeTable();
        oldPalaceCompany.CommercialBreak();
    }

}
