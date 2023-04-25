package com.company.designpatterns.mediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class MessageMediator implements Mediator {
    private List<Student> students;

    public MessageMediator() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void sendMessage(String message, Student sendStudent) {
        for (Student student : students) {
            if (student != sendStudent) {
                student.receiveMessage(message);
            }
        }
    }
}
