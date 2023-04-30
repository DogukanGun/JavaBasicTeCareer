package com.company.homeworks.designpatternsHomework.observer;

import com.company.homeworks.designpatternsHomework.observer.platforms.*;

public class ObserverApp {

    public static void main(String[] args) {

        Subscriber ahmet = new EposideSubscriber("Ahmet");
        Subscriber gokhan = new MovieSubscriber("Gökhan");

        Publication interstallerMovie = new Netflix("Interstaller");
        Publication walkingDeadEposide = new Netflix("The Walking Dead",22);

        walkingDeadEposide.addSubscriber(ahmet);
        interstallerMovie.addSubscriber(gokhan);

        walkingDeadEposide.update();
        interstallerMovie.update();



    }
}
