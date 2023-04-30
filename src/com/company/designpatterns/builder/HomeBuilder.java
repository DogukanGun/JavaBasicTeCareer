package com.company.designpatterns.builder;

public class HomeBuilder implements Builder<Home>{

    private Home home;

    //Builder ı kullanırken zincirleme şeklinde daha kolay bir biçimde özellikleri ekleyebilmek açısından
    //her bir metod, kendisini geri vermelidir. Bu yüzden return this kullanırız.
    //Örneğin; homeBuilder.addDoor().addGarage() = kapısı ve bahçesi olan bir ev döndürür.
    //Her metodun dönüş tipi, implemente ettiği sınıftır.

    public HomeBuilder() {
        this.reset();
    }

    @Override
    public Builder<Home> addWall() {
        this.home.setWall(true);
        return this;
    }

    @Override
    public Builder<Home> addDoor() {
        this.home.setDoors(true);
        return this;
    }

    @Override
    public Builder<Home> addGarage() {
        this.home.setGarage(true);
        return this;
    }

    @Override
    public Builder<Home> addGarden() {
        this.home.setGarden(true);
        return this;
    }

    @Override
    public Builder<Home> addChildRoom() {
        this.home.setChildRoom(true);
        return this;
    }

    @Override
    public Builder<Home> reset() {
        this.home = new Home();
        return this;
    }

    @Override
    public Home getResult() {

        return this.home;
    }

}
