package DP.Bridge.Paint;

import DP.Bridge.Shape.Shapes;

public class PaintingRed implements Paint{
    protected Shapes box;
    public PaintingRed(Shapes box){
        this.box=box;
    }

    @Override
    public void ReduceMoney() {
        this.box.SetMaterial("Wood");
        this.box.SetSize(this.box.GetSize()-5);
    }
    
    @Override
    public void PaintingColor() {
        this.box.SetColor("red");
    }



}
