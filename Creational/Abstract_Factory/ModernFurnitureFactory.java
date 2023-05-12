package DP.Abstract_Factory;

public class ModernFurnitureFactory implements FurnitureFactory {
    boolean ventilationButton;
    String Model;


    public ModernFurnitureFactory(){
        Model="Not available";
        ventilationButton=false;
    }

    public void CreateChair(){
        Model="chair MXZ9000";
        ventilationButton=true;
    };
    public void CreateCoffeeTable(){
        Model="Coffee table Z9000";
    }
    public void CreateSofa(){
        Model="Sofa Z1000";
        ventilationButton=true;
    }

    public void CommercialBreak (){
        if(ventilationButton)
            System.out.println("Pls buy our latest "+Model+" with extra ventilation.");
        else
            System.out.println("Pls buy our latest "+Model);
    }
}
