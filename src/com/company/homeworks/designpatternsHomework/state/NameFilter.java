package com.company.homeworks.designpatternsHomework.state;

import java.util.ArrayList;
import java.util.List;

public class NameFilter implements Filter{

private String name;

    public NameFilter(String name) {
        this.name = name.toLowerCase();
    }

    @Override
    public List<User> FilterUsers(List<User> users) {
        List<User> filteredUsers = new ArrayList<User>();

        for(User user : users){
            if(name.equals(user.getName().toLowerCase())){
                filteredUsers.add(user);
            }
        }
        return filteredUsers;
    }
}
