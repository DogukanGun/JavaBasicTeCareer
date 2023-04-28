package com.company.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;
public class YouTubeChannelImpl implements YouTubeChannel{
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer o) {
        observers.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notify(NotificationMessage m) {
        for(Observer o: observers) {
            o.update(m);
        }
    }
}
