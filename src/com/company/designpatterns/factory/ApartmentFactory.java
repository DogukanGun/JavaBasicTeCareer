package com.company.designpatterns.factory;

import com.company.designpatterns.builder.Home;

public class ApartmentFactory extends HomeFactory{
    @Override
    public Home createHome() {

        return this.createHomeBuilder().getResult();
    }

}
