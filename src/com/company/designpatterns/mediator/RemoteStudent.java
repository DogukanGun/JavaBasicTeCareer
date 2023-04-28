package com.company.designpatterns.mediator;

public class RemoteStudent extends Student{

    public RemoteStudent(Mediator med, String name){
        this.mediator=med;
        this.name=name;
    }

    @Override
    public void send(String msg) {
        System.out.println("Remote student " + this.name + " sends: "+ msg);
        System.out.println("All On-site students receive: "+ msg);
        System.out.println("All Remote students receive: "+ msg);
    }
}
