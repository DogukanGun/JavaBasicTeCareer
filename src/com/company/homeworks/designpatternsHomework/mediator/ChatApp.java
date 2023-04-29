package com.company.homeworks.designpatternsHomework.mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ChatApp implements Mediator{

    private List<Student> students;
    private Map<StudentType,Student> studentTypeMap = new HashMap<>();

    public ChatApp() {
        this.students = new ArrayList<Student>();
        this.studentTypeMap.put(StudentType.ON_SITE_STUDENT,new OnSiteStudent());
        this.studentTypeMap.put(StudentType.REMOTE_STUDENT,new RemoteStudent());
    }

    @Override
    public void sendMessage(MessageInfo messageInfo) {
        try {
            messageInfo.getStudent().sendMessage(messageInfo);
            studentTypeMap.values().stream().collect(Collectors.toList())
                            .forEach(student -> student.receiveMessage(messageInfo));
        }catch(Exception e) {

        }

    }

    @Override
    public void receiveMessage(MessageInfo messageInfo) {
        messageInfo.getStudent().receiveMessage(messageInfo);
    }

    @Override
    public void addStudent(Student student) {
        this.students.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        this.students.remove(student);
    }


}
