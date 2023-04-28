package com.company.designpatterns.mediator;

public abstract class Student {
    protected Mediator mediator;
    protected String name;

    public abstract void send(String msg);

}
