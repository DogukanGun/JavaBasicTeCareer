package com.company.designpatterns.mediator;

public class ChatDemo {
    public static void main(String[] args) {
        Mediator chat = new MediatorImpl();
        OnsiteStudent student1 = new OnsiteStudent(chat ,"A");
        RemoteStudent student2 = new RemoteStudent(chat ,"A");
        OnsiteStudent student3 = new OnsiteStudent(chat ,"B");
        chat.addStudent(student1);
        chat.addStudent(student2);
        chat.addStudent(student3);

        student1.send("Hi remote, how is going?");
        student2.send("Hi, great. I have lots of things to do, how about you?");
        student3.send(" It similar :(");

    }
}
