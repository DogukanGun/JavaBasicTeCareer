package com.company.homeworks.designpatternsHomework.state;

import java.util.List;

public interface Filter {

    List<User> FilterUsers(List<User> users);
}
