package com.company.designpatterns.builder;

public class Home {

    private boolean garage;
    private boolean doors;
    private boolean wall;
    private boolean garden;
    private boolean childRoom;

    public Home() {}

    public Home(boolean garage, boolean doors, boolean wall, boolean garden, boolean childRoom) {
        this.garage = garage;
        this.doors = doors;
        this.wall = wall;
        this.garden = garden;
        this.childRoom = childRoom;
    }

    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public boolean isDoors() {
        return doors;
    }

    public void setDoors(boolean doors) {

        this.doors = doors;
    }

    public boolean isWall() {
        return wall;
    }

    public void setWall(boolean wall) {
        this.wall = wall;
    }

    public boolean isGarden() {
        return garden;
    }

    public void setGarden(boolean garden) {
        this.garden = garden;
    }

    public boolean isChildRoom() {
        return childRoom;
    }

    public void setChildRoom(boolean childRoom) {
        this.childRoom = childRoom;
    }

    @Override
    public String toString() {
        return "Home{" +
                "garage=" + garage +
                ", doors=" + doors +
                ", wall=" + wall +
                ", garden=" + garden +
                ", childRoom=" + childRoom +
                '}';
    }
}
