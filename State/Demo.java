package DP.State;

public class Demo {
    public static void main(String[] args) {
        Phone iphone = new Phone();
        System.out.println(iphone.state.OnHome());
        System.out.println(iphone.state.OnOff());
    }
}
