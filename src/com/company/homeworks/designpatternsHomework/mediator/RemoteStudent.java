package com.company.homeworks.designpatternsHomework.mediator;

public class RemoteStudent extends Student{

    public RemoteStudent() {
    }

    public RemoteStudent(String studentName) {
        super(studentName);
    }

    @Override
    void sendMessage(MessageInfo messageInfo) {
        System.out.println('\n' + "Remote student " + messageInfo.getStudent().getStudentName()
                + " sends: " + messageInfo.getMessage()+ '\n');
    }

    @Override
    void receiveMessage(MessageInfo messageInfo) {
        System.out.println("All Remote Students receive: " + messageInfo.getMessage());
    }
}
