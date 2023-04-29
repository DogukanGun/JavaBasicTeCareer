package com.company.homeworks.designpatternsHomework.observer.Studios;

public class HBO extends StudioPublication{

    private String studioName;
    private String serialName;
    private int eposide;


    public HBO(String studioName, String serialName, int eposide) {
        this.studioName = studioName;
        this.serialName = serialName;
        this.eposide = eposide;
    }

    public String getStudioName() {
        return studioName;
    }

    public void setStudioName(String studioName) {
        this.studioName = studioName;
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
