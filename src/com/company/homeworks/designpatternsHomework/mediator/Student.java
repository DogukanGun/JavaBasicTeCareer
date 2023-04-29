package com.company.homeworks.designpatternsHomework.mediator;

public abstract class Student {

    public Student() {
    }


    public Student(String studentName) {
        this.studentName = studentName;
    }


    private String studentName;
    abstract void sendMessage(MessageInfo messageInfo);
    abstract void receiveMessage(MessageInfo messageInfo);

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
