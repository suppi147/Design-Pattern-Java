package DP.Prototype;
public class demo {
    public static void main(String [] args){
        StarFishWorld pink=new StarFishWorld();
        pink.SetHowWeEat("Anemone");
        pink.SetType("Mollusca");
        pink.SetCellType("unicellular");

        StarFishWorld yellow=(StarFishWorld)pink.Clone();
        
        yellow.Share();

    }
}
