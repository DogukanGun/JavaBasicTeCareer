package com.company.designpatterns.state;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilterDemo {
    public static void main(String[] args) {
        User user1 = new User("Pelin", 19);
        User user2 = new User("Mehmet", 26);
        User user3 = new User("Murat", 34);
        User user4 = new User("Betül", 34);

        List<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        State on = new StateImpl();
        on.filterOn();
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();

        switch(a) {
            case 1:
                on.printList(users);
                break;

            case 2:
                System.out.println("Please enter the name that you want to filter.");
                String name = sc.nextLine();
                on.filterName(users , name);
                break;

            case 3:
                System.out.println("Please enter the age that you want to filter.");
                int age = sc.nextInt();
                on.filterAge(users , age);
                break;

            default:
                System.out.println("You have entered invalid number. Please try again.");
                on.filterOn();
        }

    }
}
