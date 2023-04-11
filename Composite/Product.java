public abstract class Product implements Box {
    protected double price;
    void SetPrice(double price){
        this.price=price;
    }
    double GetPrice(){
        return this.price;
    }
}
