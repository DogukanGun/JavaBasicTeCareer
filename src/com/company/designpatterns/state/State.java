package com.company.designpatterns.state;

import java.util.List;

public interface State {
    public void filterOn();

    public void printList(List<User> users);

    public void filterName(List<User> users , String n);

    public void filterAge(List<User> users , int a);

}
