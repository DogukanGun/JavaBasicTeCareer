package com.company.designpatterns.observer;

public class NotificationDemo {
    public static void main(String[] args) {
        Subscriber1 s1 = new Subscriber1();
        Subscriber2 s2 = new Subscriber2();

        YouTubeChannelImpl p = new YouTubeChannelImpl();

        p.subscribe(s1);
        p.subscribe(s2);

        p.notify(new NotificationMessage("The YouTube channel uploaded a new video."));

        p.unsubscribe(s1);

        p.notify(new NotificationMessage("The YouTube channel now on live broadcast."));
    }
}
