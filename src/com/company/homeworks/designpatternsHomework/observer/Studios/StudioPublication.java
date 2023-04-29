package com.company.homeworks.designpatternsHomework.observer.Studios;

import java.util.ArrayList;
import java.util.List;

public abstract class StudioPublication {

    private List<StudioSubscriber> studioSubscriberList;

    public StudioPublication(){
        studioSubscriberList = new ArrayList<StudioSubscriber>();
    }

    void addStudioSubscriber(StudioSubscriber studioSubscriber){
        studioSubscriberList.add(studioSubscriber);
    }

    void removeStudioSubscriber(StudioSubscriber studioSubscriber){
        studioSubscriberList.remove(studioSubscriber);
    }

    void update(){
        for(StudioSubscriber studioSubscriber : studioSubscriberList){
            studioSubscriber.update(this);
        }
    }
}
