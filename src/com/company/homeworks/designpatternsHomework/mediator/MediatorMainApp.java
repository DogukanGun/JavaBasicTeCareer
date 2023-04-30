package com.company.homeworks.designpatternsHomework.mediator;

public class MediatorMainApp {

    private static MessageInfo messageInfo;

    public static void main(String[] args) {

        Student remoteStudentAhmet = new RemoteStudent("Ahmet");
        Student onSiteStudentHakan = new OnSiteStudent("Hakan");
        ChatApp chatApp = new ChatApp();

        chatApp.addStudent(remoteStudentAhmet);
        chatApp.addStudent(onSiteStudentHakan);

        messageInfo = new MessageInfo();
        chatApp.sendMessage(messageInfo.newMessageInfo("Merhaba, nasılsınız?",remoteStudentAhmet));
        chatApp.sendMessage(messageInfo.newMessageInfo("Merhaba, ben gayet iyiyim!",onSiteStudentHakan));

    }
}
