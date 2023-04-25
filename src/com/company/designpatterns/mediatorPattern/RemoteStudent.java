package com.company.designpatterns.mediatorPattern;

public class RemoteStudent extends Student {
    public RemoteStudent(Mediator mediator, String name) {
        super(mediator,name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println( name+" sends: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("All Remote Students receive: " + message);
    }
}
