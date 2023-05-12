package DP.Observer.Subscriber;

public class EmailSubscriber implements Subscriber{
    String email;
    public  EmailSubscriber(String email){
        this.email=email;
    }
    @Override
    public void Update() {
        System.out.println("Sending new notification to "+ this.email);
        
    }
}
