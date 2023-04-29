package com.company.designpatterns.factory;

import com.company.designpatterns.builder.Home;

public class HomeWithGarageFactory extends HomeFactory{
    @Override
    public Home createHome() {

        return this.createHomeBuilder().addGarage().getResult();
    }
}
