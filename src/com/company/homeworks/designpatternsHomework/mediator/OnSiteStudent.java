package com.company.homeworks.designpatternsHomework.mediator;

public class OnSiteStudent extends Student{

    private MessageInfo messageInfo;
    public OnSiteStudent() {
        this.messageInfo = new MessageInfo();
    }

    public OnSiteStudent(String studentName) {
        super(studentName);
    }

    @Override
    void sendMessage(MessageInfo messageInfo) {
    System.out.println('\n' + "On-site student " + messageInfo.getStudent().getStudentName()
                        + " sends: " + messageInfo.getMessage() + '\n');
    }

    @Override
    void receiveMessage(MessageInfo messageInfo) {
        System.out.println("All On-site Students receive: " + messageInfo.getMessage());
    }
}
