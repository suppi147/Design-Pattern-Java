public class Delivery {
    private Box box;
    public Delivery(){
    }

    public void SetUpOrder(Box ... boxes){
        this.box=new CompositeBox(boxes);
    }

    public double calculatePrice(){
        return box.calculatePrice();
    }
}

