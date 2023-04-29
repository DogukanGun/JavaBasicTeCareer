package com.company.homeworks.designpatternsHomework.observer.platforms;

public class Netflix extends Publication {

    private String serialName;
    private int eposide;
    private String movieName;

    public Netflix(String serialName, int eposide) {
        this.serialName = serialName;
        this.eposide = eposide;
    }

    public Netflix(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public String getSerialName() {
        return serialName;
    }

    public void setSerialName(String serialName) {
        this.serialName = serialName;
    }

    public int getEposide() {
        return eposide;
    }

    public void setEposide(int eposide) {
        this.eposide = eposide;
    }
}
