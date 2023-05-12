package DP.Factory_Method;

public abstract class Logistic {
    protected String products;
    protected int revenue;

    public Logistic(){
        products="nothing";
        revenue=0;
    }

    public abstract void CreateProduct();
    public abstract void ReviewRevenue();
    public void Summary(){    
        System.out.println("The total revenue with "+products+" product is "+revenue+"$");
    }
}
