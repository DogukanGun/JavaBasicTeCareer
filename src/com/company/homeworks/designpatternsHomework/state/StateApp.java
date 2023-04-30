package com.company.homeworks.designpatternsHomework.state;

public class StateApp {

    public static void main(String[] args) {

        UserManager userManager = new UserManager();
        userManager.addUser("Gokhan",11);
        userManager.addUser("Ahmet",25);
        userManager.addUser("Mehmet",15);
        userManager.addUser("Ahmet",15);

        Filter nameFilter = new NameFilter("Ahmet");
        Filter ageFilter = new AgeFilter(15);

        userManager.setFilter(nameFilter);
        System.out.println("All users: \n"+userManager.getAllUsers());
        System.out.println("Name filtered results: \n" + userManager.getAllFilteredUsers());
        userManager.setFilter(ageFilter);
        System.out.println("Age filtered results: \n" + userManager.getAllFilteredUsers());


    }
}
