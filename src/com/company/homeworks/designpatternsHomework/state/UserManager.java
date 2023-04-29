package com.company.homeworks.designpatternsHomework.state;

import java.util.ArrayList;
import java.util.List;

public class UserManager {

    private Filter filter;
    private List<User> users;

    public UserManager() {

        System.out.println("Welcome to User Manager Service\n");
        users = new ArrayList<User>();
    }

    void setFilter(Filter filterMethod){
    this.filter = filterMethod;
    }

    void addUser(String username,int age){
        User user = new User (username,age);
        this.users.add(user);
    }

    List<User> getAllUsers(){
        return this.users;
    }

    List<User> getAllFilteredUsers(){
        return filter.FilterUsers(this.users);
    }




}
