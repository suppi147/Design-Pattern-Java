package DP.Bridge.Shape;

public class Rectangle implements Shapes{
    String material;
    int size;
    String color;

    public Rectangle(){
        this.material="Paper";
        size=10;
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
    public void SetColor(String color) {
        this.color=color;
    }

    @Override
    public String GetColor() {
        return this.color;
    }
    @Override
    public void Show() {
        System.out.println("this is a rectangle made out of " +material+" with the size of "+size);
    }
}
