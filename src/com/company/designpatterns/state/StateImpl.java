package com.company.designpatterns.state;

import java.util.List;

public class StateImpl implements State{

    public void filterOn(){
        System.out.println("1 - Display the user list.\n2 - Filter with name.\n3 - Filter with age.\nEnter the number of the action please.");
    }

    @Override
    public void printList(List<User> users) {
        for(User u : users){
            System.out.println(u.name+ " " + u.age);
        }
    }
    @Override
    public void filterName(List<User> users , String n){
        for(int i = 0; i< users.size(); i++){
            if(users.get(i).name == n){
                System.out.println(users.get(i).name+" "+users.get(i).age);
            }
        }
    }
    @Override
    public void filterAge(List<User> users , int a){
        for(int i = 0; i< users.size(); i++){
            if(users.get(i).age == a){
                System.out.println(users.get(i).name+" "+users.get(i).age);
            }
        }
    }
}
