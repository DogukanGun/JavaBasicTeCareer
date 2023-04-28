package com.company.designpatterns.observer;

public class Subscriber2 implements Observer
{
    @Override
    public void update(NotificationMessage m) {
        System.out.println("Notification for subscriber two: " + m.getMessageContent());
    }
}