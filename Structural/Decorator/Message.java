package DP.Decorator;

public class Message implements SocialMedia {

    String mess;

    @Override
    public void Nodifier(String message) {
        this.mess=message;
    }
}
