package DP.Observer;

import DP.Observer.Publisher.Publisher;
import DP.Observer.Subscriber.EmailSubscriber;

public class demo {
    public static void main(String[] args) {
        EmailSubscriber aka123=new EmailSubscriber("aka123@gm.cm");
        EmailSubscriber meme=new EmailSubscriber("m3m@gm.cm");
        Publisher khoichannel=new Publisher();
        khoichannel.Subscribe(aka123);
        khoichannel.Subscribe(meme);

        khoichannel.Notify();
        
    }
}
