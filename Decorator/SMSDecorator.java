package DP.Decorator;

public class SMSDecorator extends SocialDecorator {

    public SMSDecorator(){

    }


    public SMSDecorator(SocialMedia socialMedia){
        super(socialMedia);
    }
    
    @Override
    public void Nodifier(String message) {
        System.out.println(message+" from SMS--- ");
        super.Nodifier(message);
    }
}
