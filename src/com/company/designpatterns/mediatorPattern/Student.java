package com.company.designpatterns.mediatorPattern;

public abstract class Student {
    protected Mediator mediator;
    protected String name;

    public Student(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void sendMessage(String message);

    public abstract void receiveMessage( String message);
}

