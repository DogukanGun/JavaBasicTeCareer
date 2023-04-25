package com.company.designpatterns.mediatorPattern;

public class Runner {
    public static void main(String[] args) {
        MessageMediator mediator = new MessageMediator();

        Student onSiteStudentA= new OnSiteStudent(mediator,"On-site Student A");
        Student onSiteStudentB = new OnSiteStudent(mediator,"On-site Student B");
        Student remoteStudentA = new RemoteStudent(mediator,"Remote Student A");


        mediator.addStudent(onSiteStudentA);
        mediator.addStudent(onSiteStudentB);
        mediator.addStudent(remoteStudentA);


        onSiteStudentA.sendMessage("Hi remote, how is going?");
        remoteStudentA.sendMessage("Hi, great. I have lots of things to do, how about you?");
        onSiteStudentB.sendMessage(" It similar \uF04C");



    }
}

