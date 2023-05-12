package DP.Decorator;

public class FacebookDecorator extends SocialDecorator {
    public FacebookDecorator(){
        
    }
    public FacebookDecorator(SocialMedia socialMedia){
        super(socialMedia);
    }

    @Override
    public void Nodifier(String message) {
        System.out.println(message+" from Facebook--- ");
        super.Nodifier(message);
    }
    
}
