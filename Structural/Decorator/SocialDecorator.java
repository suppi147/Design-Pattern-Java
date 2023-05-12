package DP.Decorator;

public class SocialDecorator implements SocialMedia{
    private SocialMedia socialMedia;

    public SocialDecorator()
    {
        
    }

    SocialDecorator(SocialMedia socialMedia){
        this.socialMedia=socialMedia;
    }

    @Override
    public void Nodifier(String message) {
        socialMedia.Nodifier(message);
    }
}
