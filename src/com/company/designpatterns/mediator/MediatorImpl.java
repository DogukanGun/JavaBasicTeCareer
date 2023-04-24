package com.company.designpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator{
    private List<Student> students;

    public MediatorImpl(){
        this.students=new ArrayList<>();
    }

    @Override
    public void addStudent (Student s){
        this.students.add(s);
    }

}

