package com.company.homeworks.designpatternsHomework.observer.platforms;

public class EposideSubscriber implements Subscriber{

    private String subscriberName;

    public EposideSubscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void update(Publication publication) {

        Netflix netflix = (Netflix) publication;


        System.out.println(this.subscriberName + ", " + netflix.getSerialName() + " " + netflix.getEposide() + ". bölümü yayında!");

    }
}
