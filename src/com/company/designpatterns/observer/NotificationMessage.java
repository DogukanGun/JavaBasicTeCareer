package com.company.designpatterns.observer;

public class NotificationMessage {
    final String messageContent;

    public NotificationMessage (String m) {
        this.messageContent = m;
    }

    public String getMessageContent() {
        return messageContent;
    }
}
