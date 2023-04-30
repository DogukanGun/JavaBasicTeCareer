package com.company.homeworks.designpatternsHomework.observer.platforms;

import java.util.ArrayList;
import java.util.List;

public abstract class Publication {

    private List<Subscriber> subscriberList;

    public Publication(){
        subscriberList = new ArrayList<Subscriber>();
    }

    public void addSubscriber(Subscriber subscriber){
        subscriberList.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber){
        subscriberList.remove(subscriber);
    }

    public void update(){
        for(Subscriber subscriber : subscriberList){
            subscriber.update(this);
        }
    }

}
