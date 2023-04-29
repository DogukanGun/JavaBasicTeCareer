package com.company.homeworks.designpatternsHomework.observer.platforms;

public class MovieSubscriber implements Subscriber{

    private String subscriberName;


    public MovieSubscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void update(Publication publication) {
        Netflix netflix = (Netflix) publication;

        System.out.println(subscriberName + ", " + netflix.getMovieName() + " şu anda netflixte!");
    }
}
