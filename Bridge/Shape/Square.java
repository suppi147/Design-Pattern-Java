package DP.Bridge.Shape;



public class Square implements Shapes {
    String material;
    int size;
    String color;
    public Square(){
        this.material="Steel";
        size=100;
    }

    @Override
    public String GetMaterial() {
        return this.material;
    }

    @Override
    public int GetSize() {
        return this.size;
    }

    @Override
    public void SetMaterial(String material) {
        this.material=material;
    }

    @Override
    public void SetSize(int size) {
        this.size=size;
    }

    @Override
    public String GetColor() {
        return color;
    }

    @Override
    public void SetColor(String color) {
        this.color=color;
    }

    @Override
    public void Show() {
        System.out.println("this is a square made of " +material+" with the size of "+size+" with color "+color);
    }
}
