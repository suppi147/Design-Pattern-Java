public class Book extends Product{
    public Book(double price){
        super.price=price;
    }
    @Override
    public double calculatePrice() {
        
        return super.price;
    }
}
