package DP.Decorator;

public class demo {
    public static void main(String [] args){
        SocialDecorator socialDecorator= new FacebookDecorator(new SMSDecorator(new Message()));
        socialDecorator.Nodifier("hi");
    }
}
