package DP.Observer.Publisher;

import java.util.*;

import DP.Observer.Subscriber.Subscriber;

public class Publisher {
    List<Subscriber> subscribers= new ArrayList<>();

    

    public void Subscribe(Subscriber subcriber){
        subscribers.add(subcriber);
    }

    public void UnSubscribe(Subscriber subcriber){
        subscribers.remove(subcriber);
    }

    public void Notify(){
        for(Subscriber subcriber : subscribers){
            subcriber.Update();
        }
    }
}
