package com.company.homeworks.designpatternsHomework.mediator;

public interface Mediator {

    void sendMessage(MessageInfo messageInfo);
    void receiveMessage(MessageInfo messageInfo);

    void addStudent(Student student);

    void removeStudent(Student student);
}
