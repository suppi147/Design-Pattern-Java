public class demo {
    public static void main(String [] args){
        Delivery delivery=new Delivery();
        delivery.SetUpOrder(new CompositeBox(
                                new Videogame(213), new Book(2132)),
                            new CompositeBox(
                                new Book(213),new Book(123)));
        System.out.print(delivery.calculatePrice());
    }
}
