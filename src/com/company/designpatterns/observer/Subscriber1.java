package com.company.designpatterns.observer;

public class Subscriber1 implements Observer
{
    @Override
    public void update(NotificationMessage m) {
        System.out.println("Notification for subscriber one: " + m.getMessageContent());
    }
}