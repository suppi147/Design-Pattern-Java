package DP.Bridge;

import DP.Bridge.Paint.PaintingRed;
import DP.Bridge.Shape.Rectangle;
import DP.Bridge.Shape.Square;

public class demo {
    public static void main(String [] args){
        Square square= new Square();
        PaintingRed red= new PaintingRed(square);
        red.ReduceMoney();
        red.PaintingColor();
        square.Show();

        Rectangle rectangle=new Rectangle();
        rectangle.Show();
    }
}
