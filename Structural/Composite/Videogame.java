public class Videogame extends Product {
    public Videogame(double price){
        super.price=price;
    }
    @Override
    public double calculatePrice() {
        return super.price;
         
    }
}
