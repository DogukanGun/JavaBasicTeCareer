package com.company.designpatterns.observer;

public interface YouTubeChannel {
    public void subscribe(Observer o);
    public void unsubscribe(Observer o);
    public void notify(NotificationMessage m);
}
