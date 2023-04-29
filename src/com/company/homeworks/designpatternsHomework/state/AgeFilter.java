package com.company.homeworks.designpatternsHomework.state;

import java.util.ArrayList;
import java.util.List;

public class AgeFilter implements Filter{

    private int age;

    public AgeFilter(int age) {
        this.age = age;
    }

    @Override
    public List<User> FilterUsers(List<User> users) {
        List<User> filteredUsers = new ArrayList<User>();

        for(User user : users){
            if(user.getAge() == age){
                filteredUsers.add(user);
            }
        }
        return filteredUsers;
    }
}
