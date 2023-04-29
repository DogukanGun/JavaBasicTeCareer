package com.company.homeworks.designpatternsHomework.mediator;

public class MessageInfo {

    private String message;
    private Student student;

    public MessageInfo() {
    }

    public MessageInfo(String message, Student student) {
        this.message = message;
        this.student = student;
    }

    MessageInfo newMessageInfo(String message, Student student){
        this.message = message;
        this.student = student;
        return this;
    }

    @Override
    public String toString() {
        return "New message!\n" +
                student + ": " + message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
